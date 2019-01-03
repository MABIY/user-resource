package net.vipmro.user.resource.web.spring;

import net.vipmro.user.resource.web.filter.RequestResponseLoggingFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class FilterConfig {
	@Bean
	public FilterRegistrationBean loggingFilter() {
		FilterRegistrationBean registrationBean = new FilterRegistrationBean();
		registrationBean.setFilter(new RequestResponseLoggingFilter());
		registrationBean.addUrlPatterns("/oauth/token",
				"/goods/*"
				, "/user/*",
				"/tokenLogout");
		return registrationBean;
	}
}
