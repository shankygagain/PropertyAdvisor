package com.example.PropertyAdvisor;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Map;

@Configuration
@PropertySource("classpath:custom-datasource.properties")
@ConfigurationProperties(prefix = "spring.datasource")
public class DataSourceConfig {

    private String username;

    private String password;

    private String url;

    private String driverClassName;

//    private Map<String, String> datasource;
//
//    public Map<String, String> getDatasource() {
//        return datasource;
//    }
//
//    public void setDatasource(Map<String, String> datasource) {
//        this.datasource = datasource;
//    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }
}
