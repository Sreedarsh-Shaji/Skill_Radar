package com.srusers.srUsers.dao;
/*
* Optimize with lombok and jpa
* */

import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.Field;
import org.springframework.data.couchbase.core.query.N1qlPrimaryIndexed;
import org.springframework.data.couchbase.core.query.ViewIndexed;

@Document
public class User {

    @Id
    int id;
    @Field
    String name;
    @Field
    String email;
    @Field
    String address;
    @Field
    String password;

    public User() {
    }

    public User(int id, String name, String email, String address, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}