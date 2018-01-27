package com.jdeath.entity;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class RichestUser {
    @Id
    @Column(name = "userId")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "sureName")
    private String sureName;

    public RichestUser() {
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

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }

}
