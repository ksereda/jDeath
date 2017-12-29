package com.jdeath.dao.impl;

import com.jdeath.dao.RichestUserDao;
import com.jdeath.entity.RichestUser;

public class RichestUserDaoImpl extends BasicDaoImpl<RichestUser> implements RichestUserDao{

    public RichestUserDaoImpl(Class<RichestUser> entityClass) {
        super(entityClass);
    }

    @Override
    public RichestUser findRichestUserByPhoneNumber(String phoneNumber) {
        return (RichestUser) sessionFactory.getCurrentSession()
                .createQuery("SELECT phone FROM users where phoneNumber = ?")
                .setParameter(0, phoneNumber)
                .uniqueResult();
    }
}
