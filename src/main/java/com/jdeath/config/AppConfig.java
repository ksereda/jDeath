package com.jdeath.config;

import com.jdeath.dao.DocumentDao;
import com.jdeath.dao.RichestUserDao;
import com.jdeath.dao.impl.DocumentDaoImpl;
import com.jdeath.dao.impl.RichestUserDaoImpl;
import com.jdeath.entity.Document;
import com.jdeath.entity.RichestUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.jdbc.JdbcDaoImpl;

import java.util.ArrayList;

@Configuration
@PropertySource(value = {"classpath:util.properties"})
public class AppConfig {
    @Autowired
    Environment environment;

//    @Bean
//    public UserDetailsService userDetailsService() {
//        JdbcDaoImpl jdbcImpl = new JdbcDaoImpl();
//        jdbcImpl.setDataSource(dataSource());
//        jdbcImpl.setUsersByUsernameQuery(environment.getRequiredProperty("usersByQuery"));
//        jdbcImpl.setAuthoritiesByUsernameQuery(environment.getRequiredProperty("rolesByQuery"));
//        return jdbcImpl;
//    }

    @Bean
    public DriverManagerDataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(environment.getProperty("jdbc.mysql.driverClass"));
        dataSource.setUrl(environment.getProperty("jdbc.mysql.url"));
        dataSource.setUsername(environment.getProperty("jdbc.mysql.username"));
        dataSource.setPassword(environment.getProperty("jdbc.mysql.password"));
        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource());
        ArrayList <Document> documents = new ArrayList<>();
        documents.stream().forEach((document)-> document.getName() );
        
        return jdbcTemplate;
    }

    @Bean
    RichestUserDao richestUserDao() {
        return new RichestUserDaoImpl(RichestUser.class);
    }

    @Bean
    DocumentDao documentDao() {
        return new DocumentDaoImpl(Document.class);
    }

}
