package com.jdeath.dao.impl;

import com.jdeath.dao.DocumentDao;
import com.jdeath.entity.Document;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class DocumentDaoImpl extends BasicDaoImpl<Document> implements DocumentDao{

    public DocumentDaoImpl(Class<Document> entityClass) {
        super(entityClass);
    }

}
