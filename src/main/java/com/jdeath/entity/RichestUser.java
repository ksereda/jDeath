package com.jdeath.entity;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class RichestUser {
    @Id
    @Column(name = "userId")
//    @GeneratedValue(strategy = GenerationType.IDENTITY);
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "sureName")
    private String sureName;

    @Column(name = "phone")
    private String phoneNumber;

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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
