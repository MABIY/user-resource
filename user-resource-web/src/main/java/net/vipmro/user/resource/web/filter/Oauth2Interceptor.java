package net.vipmro.user.resource.web.filter;

// import net.vipmro.user.passport.oauth2.commons.ApplicationSupport;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * The type Oauth 2 interceptor check access_token
 */// lhtd remore
public class Oauth2Interceptor extends HandlerInterceptorAdapter {
    // @Override
    // public boolean preHandle(HttpServletRequest request,
    //                          HttpServletResponse response, Object handler) throws Exception {
    //     String accessToken = request.getHeader("Authorization");
    //
    //     if (true) {
    //         return true;
    //     }
    //     TokenStore tokenStore = (TokenStore) ApplicationSupport.getBean("tokenStore");
    //     OAuth2Authentication oAuth2Authentication = tokenStore.readAuthentication(accessToken);
    //     if (oAuth2Authentication == null) {
    //         return true;
    //     }
    //     SecurityContextHolder.getContext().setAuthentication(oAuth2Authentication);
    //     return true;
    // }
}
