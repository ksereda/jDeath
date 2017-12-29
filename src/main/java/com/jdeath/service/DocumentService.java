package com.jdeath.service;

import com.jdeath.entity.Document;

import java.util.List;

public interface DocumentService {
    /**
         * Receive all documents from DB
         *
         * @return document list
         **/

    List<Document> getDocumentList();
}
