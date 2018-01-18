package com.jdeath.model.impl;

import com.jdeath.model.User;
import org.springframework.stereotype.Component;

import java.sql.*;

@Component
public class UserImpl implements User {

    private String name;
    private String sureName;

    public UserImpl() {
    }

    public static void init() throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
    }

    @Override
    public String getRichestUser() {
        String query = ("select * from users AS u JOIN accounts AS acc ON u.userId = acc.userId WHERE acc.account = (SELECT MAX(account) FROM accounts);");
        UserImpl user = new UserImpl();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            init();
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdeath2", "root", "root");
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                user.setName(resultSet.getString("name"));
                user.setSureName(resultSet.getString("sureName"));
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (resultSet != null)
                try {
                    resultSet.close();
                } catch (SQLException ignore) {
                }
            if (statement != null)
                try {
                    statement.close();
                } catch (SQLException ignore) {
                }
            if (connection != null)
                try {
                    connection.close();
                } catch (SQLException ignore) {
                }
        }
        return "The richest user: " + user.getName() + " " + user.getSureName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }
}





