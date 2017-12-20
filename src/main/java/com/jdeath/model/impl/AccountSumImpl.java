package com.jdeath.model.impl;

import com.jdeath.model.AccountSum;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class AccountSumImpl implements AccountSum {
    private JdbcTemplate jdbcTemplate;

    public AccountSumImpl() {
    }

    public AccountSumImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public String getAccountSum() {
        String query = ("");
        jdbcTemplate.execute(query);
        return null;
    }
}
