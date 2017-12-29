package com.jdeath.dao.impl;

import com.jdeath.dao.RichestUserDao;
import com.jdeath.entity.RichestUser;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class RichestUserDaoImpl extends BasicDaoImpl<RichestUser> implements RichestUserDao{

    @Autowired
    Session session;

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

    @Override
    public RichestUser findRichestUser() {
        Session session = sessionFactory.openSession();
        RichestUser richestUser = new RichestUser();
        sessionFactory.getCurrentSession();
        richestUser.getName();
        session.close();


        return findRichestUser();
    }

}
