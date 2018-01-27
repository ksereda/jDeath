package com.jdeath.model.impl;

import com.jdeath.model.Account;
import org.springframework.stereotype.Component;
import java.sql.*;

@Component
public class AccountImpl implements Account {

    private Integer account;

    public AccountImpl() {
    }

    public static void init() throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
    }

    @Override
    public Integer getAccountSum() {
        String query = ("select SUM(account) from accounts");
        AccountImpl account = new AccountImpl();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            init();
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdeath2", "root", "root");
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                account.setAccount(resultSet.getInt(1));
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
        return account.getAccount();
    }

    public Integer getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }
}
