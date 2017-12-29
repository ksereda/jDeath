package com.jdeath.dao;

import com.jdeath.entity.RichestUser;

import java.util.List;

public interface RichestUserDao extends BasicDao<RichestUser>{

    /**
        * Find user by phone number
        *  @param phoneNumber - user's phone number
        * @return current user
        **/
    RichestUser findRichestUserByPhoneNumber(String phoneNumber);
}
