package com.jdeath.config;

import com.jdeath.model.UserRichest;
import com.jdeath.model.impl.UserRichestImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.jms.Session;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;

@Configuration
@PropertySource(value={"classpath:util.properties"})
public class AppConfig {

    @Autowired
    private Environment environment;

//    @Autowired
//    DriverManagerDataSource driverManagerDataSource;

    @Autowired
    UserRichest userRichest;

    @Bean
    public DriverManagerDataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName(environment.getProperty("jdbc.mysql.driverClass"));
        dataSource.setUrl(environment.getProperty("jdbc.mysql.url"));
        dataSource.setUsername(environment.getProperty("jdbc.mysql.username"));
        dataSource.setPassword(environment.getProperty("jdbc.mysql.password"));
        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource());
        return jdbcTemplate;
    }

//    @Bean
//    public UserRichest userRichest() {
//        return new UserRichestImpl(jdbcTemplate());
//    }


//    @Bean
//    public UserRichest userRichest() {
//        return new UserRichestImpl();
//    }

}
