package net.vipmro.user.resource.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;


/**
 * @author liuhua
 */

@SpringBootApplication
@EnableOAuth2Client
public class AuthorizationServerApplication extends SpringBootServletInitializer {
	
	public static void main(String[] args) {
		SpringApplication.run(AuthorizationServerApplication.class, args);
	}
	
}