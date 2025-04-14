package com.example.PropertyAdvisor;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;

@Configuration
public class HikariConfig {

    @Autowired
    private Environment environment;

    @Bean
    public DataSource dataSource(){
      String url = environment.getProperty("spring.datasource.url");
      String username = environment.getProperty("spring.datasource.username");
      String password = environment.getProperty("spring.datasource.password");
      String driverClassName = environment.getProperty("spring.datasource.driver-class-name");


        com.zaxxer.hikari.HikariConfig config = new com.zaxxer.hikari.HikariConfig();
        config.setJdbcUrl(url);
        config.setUsername(username);
        config.setPassword(password);
        config.setDriverClassName(driverClassName);

        return new HikariDataSource(config);
    }
}
