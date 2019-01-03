package net.vipmro.user.resource.web.interceptor;

import lombok.extern.slf4j.Slf4j;
import net.vipmro.user.resource.commons.contants.HeaderConstants;
import net.vipmro.user.resource.commons.enums.ResultCode;
import net.vipmro.user.resource.commons.exceptions.BusinessException;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * @author zhumaer
 * @desc 接口响应体控制拦截器
 * @since 4/1/2018 3:00 PM
 */
@Slf4j
public class RequestHeaderParamCheckInterceptor implements HandlerInterceptor {
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		String apiVersion = request.getHeader(HeaderConstants.API_VERSION);
		try {
			if (apiVersion != null) {
				Double.valueOf(apiVersion);
			}
		} catch (NumberFormatException e) {
			throw new BusinessException(ResultCode.HEAD_PARAM_TYPE_BIND_ERROR);
		}
		return true;
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
		// nothing to do
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
		// nothing to do
	}
	
}
