package com.srusers.srUsers.dao;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.UUID;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    UUID id;

    String name;

    String email;

    String address;

    String password;

}
