package com.srusers.srUsers.dao;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.UUID;

@Data
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    int id;

    String name;

    String email;

    String address;

    String password;

}
