package net.vipmro.user.resource.web.spring;

import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisPassword;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettucePoolingClientConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.error.OAuth2AccessDeniedHandler;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.redis.RedisTokenStore;

import java.time.Duration;

import static org.springframework.context.annotation.FilterType.ASSIGNABLE_TYPE;

/**
 * @author lh
 * 资源服务器　配置
 */
@Configuration
@EnableResourceServer
@EnableWebSecurity
@ComponentScan(basePackageClasses = {
		net.vipmro.user.resource.infrastructure.Components.class,
		net.vipmro.user.resource.domain.Components.class})
public class ResourceServerConfiguration extends ResourceServerConfigurerAdapter {
	
	
	@Value("${spring.redis.host}")
	private String redisHost;
	
	@Value("${spring.redis.port}")
	private int redisPort;
	
	@Value("${spring.redis.database}")
	private int redisDataBase;
	@Value("${spring.redis.password}")
	private String redisPassword;
	
	@Value("${spring.redis.command.time.out}")
	private long redisCommandTimeout;
	
	@Value("${spring.redis.minIdle}")
	private int redisMinIdle;
	
	@Value("${spring.redis.maxIdle}")
	private int redisMaxIdle;
	
	@Value("${spring.redis.maxTotal}")
	private int redisMaxTotal;
	
	@Value("${spring.redis.maxWaitMillis}")
	private int redisMaxWaitMillis;
	
	@Value("${spring.redis.minEvictableIdleTimeMillis}")
	private int redisMinEvictableIdleTimeMillis;
	
	@Value("${spring.redis.timeBetweenEvictionRunsMillis}")
	private int redisTimeBetweenEvictionRunsMillis;
	
	@Value("${spring.redis.testWhileIdle}")
	private boolean redisTestWhileIdle;
	
	
	public static final String DEMO_RESOURCE_ID = "order";
	
	@Override
	public void configure(ResourceServerSecurityConfigurer resources) {
		resources.resourceId(DEMO_RESOURCE_ID).stateless(true);//不验证 resourceId
	}
	
	/**
	 * oauth2 resource Server 的拦截器设置
	 *
	 * @param http
	 * @throws Exception
	 */
	@Override
	public void configure(HttpSecurity http) throws Exception { //lhtd 一个应用只能有一个账号登录
		http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED)
				.and()
				.requestMatchers().anyRequest()
				.and()
				.authorizeRequests()
				.antMatchers("/user/**").hasAuthority("ROLE_USER")
				.antMatchers("/test/**").hasAuthority("ROLE_USER")
				//.antMatchers("/router/rest/order/**").authenticated()
				.anyRequest().authenticated()
				.and().exceptionHandling().accessDeniedHandler(new OAuth2AccessDeniedHandler());

	}
	
	
	
	@Bean
	public LettuceConnectionFactory redisConnectionFactory() {
		RedisStandaloneConfiguration redisStandaloneConfiguration = new RedisStandaloneConfiguration();
		redisStandaloneConfiguration.setHostName(redisHost);
		redisStandaloneConfiguration.setPort(redisPort);
		redisStandaloneConfiguration.setPassword(RedisPassword.of(redisPassword));
		redisStandaloneConfiguration.setDatabase(redisDataBase);
		LettucePoolingClientConfiguration clientConfig = LettucePoolingClientConfiguration.builder()
				.commandTimeout(Duration.ofMillis(redisCommandTimeout))
				.poolConfig(genericObjectPoolConfig())
				.build();
		return new LettuceConnectionFactory(redisStandaloneConfiguration, clientConfig);
	}
	
	/**
	 * GenericObjectPoolConfig 连接池配置
	 *
	 * @return
	 */
	public GenericObjectPoolConfig genericObjectPoolConfig() {
		GenericObjectPoolConfig config = new GenericObjectPoolConfig();
		config.setMinIdle(redisMinIdle);
		config.setTestWhileIdle(redisTestWhileIdle);
		config.setMaxIdle(redisMaxIdle);
		config.setMaxTotal(redisMaxTotal);
		config.setMaxWaitMillis(redisMaxWaitMillis);
		config.setMinEvictableIdleTimeMillis(redisMinEvictableIdleTimeMillis);//the minimum amount of time an object may sit idle in the pool before it is eligible for eviction.
		config.setTimeBetweenEvictionRunsMillis(redisTimeBetweenEvictionRunsMillis);
		return config;
	}
    /**
     * 配置AccessToken的存储方式：此处使用Redis存储
     * Token的可选存储方式
     * 1、InMemoryTokenStore
     * 2、JdbcTokenStore
     * 3、JwtTokenStore
     * 4、RedisTokenStore
     * 5、JwkTokenStore
     */
    @Bean
    public TokenStore tokenStore(LettuceConnectionFactory lettuceConnectionFactory) {
		return new RedisTokenStore(lettuceConnectionFactory);
    }
	
	
}
