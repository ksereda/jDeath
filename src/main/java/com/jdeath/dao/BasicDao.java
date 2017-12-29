package com.jdeath.dao;

import org.hibernate.Session;
import java.util.List;

/**
 * Basic methds for DAO
 **/
public interface BasicDao<T> {

    /**
        * @return current Hibernate session
        **/
    Session getCurrentSession();

    /**
         * @return list  for entity
         **/
    List<T> getList();

}
