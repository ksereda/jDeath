package com.jdeath.model.impl;

import com.jdeath.model.UserRichest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class UserRichestImpl implements UserRichest {
    private JdbcTemplate jdbcTemplate;

    public UserRichestImpl() {
    }

    public UserRichestImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public String getRichestUser() {
        String query = {""};
        jdbcTemplate.execute(query);
        return null;
    }
}
