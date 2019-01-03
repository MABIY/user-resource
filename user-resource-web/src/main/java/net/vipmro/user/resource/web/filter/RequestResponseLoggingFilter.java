package net.vipmro.user.resource.web.filter;

import lombok.extern.slf4j.Slf4j;
import net.vipmro.user.resource.web.util.MapTemplateUtils;
import org.springframework.web.util.ContentCachingRequestWrapper;
import org.springframework.web.util.ContentCachingResponseWrapper;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Date;

@Slf4j
public class RequestResponseLoggingFilter implements Filter {
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}
	
	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
		ContentCachingRequestWrapper requestWrapper = new ContentCachingRequestWrapper((HttpServletRequest) servletRequest);
		ContentCachingResponseWrapper responseWrapper = new ContentCachingResponseWrapper((HttpServletResponse) servletResponse);
		httpRequestWithLog(filterChain, requestWrapper, responseWrapper);
		responseWrapper.copyBodyToResponse();
	}
	
	
	private void httpRequestWithLog(FilterChain filterChain, ContentCachingRequestWrapper requestWrapper, ContentCachingResponseWrapper responseWrapper) throws IOException, ServletException {
		String request_path = null;
		try {
			request_path = new URI(requestWrapper.getRequestURI()).getPath();
		} catch (URISyntaxException e) {
			request_path = requestWrapper.getRequestURI();
		}
		Date startTime = new Date();
		filterChain.doFilter(requestWrapper, responseWrapper);
		Date endTime = new Date();
		String requestBody = "";
		switch (requestWrapper.getMethod()) {
			case "POST":
			case "PUT":
				requestBody = new String(requestWrapper.getContentAsByteArray());
				break;
		}
		try {
			MapTemplateUtils.mongodbLogHttpRequest(requestWrapper.getRequest().getRemoteHost(), request_path, String.valueOf(requestWrapper.getRequestURL()), startTime, endTime, responseWrapper.getStatusCode(), requestBody, new String(responseWrapper.getContentAsByteArray()));
		} catch (Exception e) {
			log.error(e.getClass() + " start ,", e);
		}
	}
	
	@Override
	public void destroy() {
	
	}
}
