package testevaga.config;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class DataSourceConfig {
	
	@Bean(name = "h2DataSource")
    @ConfigurationProperties(prefix = "spring.datasource")
    DriverManagerDataSource h2DataSource() {
        return new DriverManagerDataSource();
    
}
}