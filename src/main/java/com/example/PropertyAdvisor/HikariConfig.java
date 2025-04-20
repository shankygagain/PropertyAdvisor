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

    @Autowired
    private DataSourceConfig dataSourceConfig;

    @Bean
    public DataSource dataSource(){


        com.zaxxer.hikari.HikariConfig config = new com.zaxxer.hikari.HikariConfig();
        config.setJdbcUrl(dataSourceConfig.getUrl());
        config.setUsername(dataSourceConfig.getUsername());
        config.setPassword(dataSourceConfig.getPassword());
        config.setDriverClassName(dataSourceConfig.getDriverClassName());

        return new HikariDataSource(config);
    }
}
