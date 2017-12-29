package com.jdeath.service;

import com.jdeath.entity.RichestUser;

import java.util.List;

public interface RichestUserService {
    /**
     * Receive all richest users from DB
     *
     * @return users list
     **/

    RichestUser getRichestUserPhoneNumber(String phoneNumber);
}
