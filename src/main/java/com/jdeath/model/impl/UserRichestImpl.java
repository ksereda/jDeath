package com.jdeath.model.impl;

import com.jdeath.model.UserRichest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.sql.*;


@Component
public class UserRichestImpl implements UserRichest {

//    private JdbcTemplate jdbcTemplate;

    public String name;
    public String sureName;

    Connection conn;
    Driver driver;
    Statement statement;

    public UserRichestImpl() {
        try {
            conn = DriverManager.getConnection("jdbc.mysql.url", "jdbc.mysql.username", "jdbc.mysql.password");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public String getRichestUser() {
        String query = ("select * from users AS u JOIN accounts AS acc ON u.userId = acc.userId WHERE acc.account = (SELECT MAX(account) FROM accounts);");
        try {
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                String name = resultSet.getString(2);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return name;
    }





//    public UserRichestImpl(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }





//    public String getRichestUser() {
//        String result = null;
//        String query = ("SELECT * FROM users");
//        if (jdbcTemplate == null) {
//            result = "error";
//        }
//        jdbcTemplate.execute(query);
//        return result;
//    }




//    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
//        this.jdbcTemplate = jdbcTemplate;
//    }







//    public String getRichestUser() {
//        String query = ("select * from users AS u JOIN accounts AS acc ON u.userId = acc.userId WHERE acc.account = (SELECT MAX(account) FROM accounts);");
//        try {
//            jdbcTemplate.execute(query);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return "Sam Smith";
//
//
//    }

}





