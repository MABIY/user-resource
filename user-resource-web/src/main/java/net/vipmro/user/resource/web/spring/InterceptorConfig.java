package net.vipmro.user.resource.web.spring;

import net.vipmro.user.resource.web.interceptor.RequestHeaderParamCheckInterceptor;
import net.vipmro.user.resource.web.interceptor.ResponseResultInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class InterceptorConfig extends WebMvcConfigurerAdapter {
	
	
	@Autowired
	ResponseResultInterceptor responseResultInterceptor;
	
	@Autowired
	RequestHeaderParamCheckInterceptor requestHeaderParamCheckInterceptor;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		String apiUri = "/**"; //lhtd
		registry.addInterceptor(responseResultInterceptor).addPathPatterns(apiUri).excludePathPatterns("/static/**");
		registry.addInterceptor(requestHeaderParamCheckInterceptor).addPathPatterns(apiUri).excludePathPatterns("/static/**");
		
	}
	
	@Bean
	public ResponseResultInterceptor responseResultInterceptor() {
		return new ResponseResultInterceptor();
	}
	
	@Bean
	public RequestHeaderParamCheckInterceptor requestHeaderParamCheckInterceptor() {
		return new RequestHeaderParamCheckInterceptor();
	}
	
}
