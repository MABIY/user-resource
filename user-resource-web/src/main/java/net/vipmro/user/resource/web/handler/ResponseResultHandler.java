package net.vipmro.user.resource.web.handler;

import lombok.extern.slf4j.Slf4j;
import net.vipmro.user.passport.oauth2.commons.oauth2.UserRepositoryUserDetails;
import net.vipmro.user.resource.commons.annoations.ResponseResult;
import net.vipmro.user.resource.commons.annoations.special.QfsmResponseData;
import net.vipmro.user.resource.commons.contants.HeaderConstants;
import net.vipmro.user.resource.commons.result.Client;
import net.vipmro.user.resource.commons.result.DefaultErrorResult;
import net.vipmro.user.resource.commons.result.PlatformResult;
import net.vipmro.user.resource.commons.result.Result;
import net.vipmro.user.resource.commons.util.JsonUtil;
import net.vipmro.user.resource.commons.util.RequestContextUtil;
import net.vipmro.user.resource.web.interceptor.ResponseResultInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.MethodParameter;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * @author lh
 * @desc
 * @since 2018-11-26
 */
@ControllerAdvice
@Slf4j
public class ResponseResultHandler implements ResponseBodyAdvice<Object> {
	
	@Autowired
	private MongoTemplate mongoTemplate;
	
	@Override
	public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) {
		HttpServletRequest request = RequestContextUtil.getRequest();
		ResponseResult responseResultAnn = (ResponseResult) request.getAttribute(ResponseResultInterceptor.RESPONSE_RESULT);
		if (responseResultAnn != null) {
			
			//<editor-fold desc="千帆商贸接口维护已使用的返回格式　添加的判断">
			if (returnType.getMethod().getAnnotation(QfsmResponseData.class) == null) {
				return true;
			} else {
				return RequestContextUtil.getRequest().getHeader(HeaderConstants.API_VERSION) != null;
			}
			//</editor-fold>
		}
		return false;
	}
	
	@Override
	public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class<? extends HttpMessageConverter<?>> selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
		
		ResponseResult responseResultAnn = (ResponseResult) RequestContextUtil.getRequest().getAttribute(ResponseResultInterceptor.RESPONSE_RESULT);
		Client client = new Client();
		try {
			Authentication userAuthentication = ((OAuth2Authentication) SecurityContextHolder.getContext().getAuthentication()).getUserAuthentication();
			String clientId;
			if (userAuthentication != null) { //用户验证模式
				UserRepositoryUserDetails principal = (UserRepositoryUserDetails) userAuthentication.getPrincipal();
				clientId = principal.getClient().getClientId();
			} else { //客户端验证模式
				clientId = SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
			}
			Class<? extends Result> resultClazz = responseResultAnn.value();
			client = Client.builder()
					.clientId(clientId)
					.build();
			if (resultClazz.isAssignableFrom(PlatformResult.class)) {
				if (body instanceof DefaultErrorResult) {
					DefaultErrorResult defaultErrorResult = (DefaultErrorResult) body;
					body = PlatformResult.builder()
							.code(defaultErrorResult.getCode())
							.msg(defaultErrorResult.getMessage())
							.data(defaultErrorResult)
							.client(client)
							.build();
				} else if (body instanceof String) {
					body = JsonUtil.object2Json(PlatformResult.success(body, client)); //lhtd 验证返回类型
				} else {
					body = PlatformResult.success(body, client);
				}
			}
		} catch (Exception e) {
			log.error(e.getClass() + " start, uri:{}, caused by: ", RequestContextUtil.getRequest().getRequestURL(), e);
			body = PlatformResult.failure(e.getMessage(), client);
		}
		return body;
	}
	
}
