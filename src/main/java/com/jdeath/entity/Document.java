package com.jdeath.entity;

import javax.persistence.*;

@Entity
@Table(name = "document")
public class Document {
    @Id
    @Column(name = "document_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "document_name")
    private String name;

    public Document() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
