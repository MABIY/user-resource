package net.vipmro.user.resource.infrastructure.spring;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfigure {
	public static final String PRIMARY_DATASOURCE = "PRIMARY_DS";
	
	@Primary
	@Bean(PRIMARY_DATASOURCE)
	@ConfigurationProperties(prefix = "primary.datasource")
	public DataSource primaryDB() {
		return DataSourceBuilder.create().build();
	}
	
}
