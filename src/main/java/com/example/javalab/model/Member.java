package com.example.javalab.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Member {
    @Id
    String name;
    Status status;
    Date renewalDate;


    public Member(){};
}
