package com.jdeath.service.impl;

import com.jdeath.dao.DocumentDao;
import com.jdeath.entity.Document;
import com.jdeath.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("documentService")
public class DocumentServiceImpl implements DocumentService {
    @Autowired
    DocumentDao documentDao;

    @Override
    public List<Document> getDocumentList() {
        return documentDao.getList();
    }
}
