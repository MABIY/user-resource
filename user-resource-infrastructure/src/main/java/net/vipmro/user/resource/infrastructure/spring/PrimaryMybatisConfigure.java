package net.vipmro.user.resource.infrastructure.spring;

import net.vipmro.user.resource.infrastructure.mapper.Components;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackageClasses = Components.class, sqlSessionFactoryRef = "primarySessionFactory")
public class PrimaryMybatisConfigure {
	private static final String PRIMARY_SESSION_FACTORY = "primarySessionFactory";
	
	@Autowired
	@Qualifier(DataSourceConfigure.PRIMARY_DATASOURCE)
	private DataSource primaryDataSource;
	
	@Primary
	@Bean(name = PRIMARY_SESSION_FACTORY)
	public SqlSessionFactoryBean sqlSessionFactoryOfPrimary() throws Exception {
		final SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(primaryDataSource);
		sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mybatis/*.xml"));
		return sqlSessionFactoryBean;
	}
	
	@Bean
	public SqlSessionTemplate sqlSessionTemplate1() throws Exception {
		SqlSessionTemplate template = new SqlSessionTemplate(sqlSessionFactoryOfPrimary().getObject()); // 使用上面配置的Factory
		return template;
	}
}
