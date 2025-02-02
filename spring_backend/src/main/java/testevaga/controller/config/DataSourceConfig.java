package testevaga.controller.config;

import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class DataSourceConfig {
	
	@Bean(name = "h2Data")
	@ConfigurationProperties(prefix = "spring.datasource")
	DataSourceAutoConfiguration h2Data() {
		return new DataSourceAutoConfiguration();
	}
	
	
	
}
