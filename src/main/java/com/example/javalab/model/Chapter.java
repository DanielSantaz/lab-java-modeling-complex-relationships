package com.example.javalab.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Chapter {
    @Id
    String name;
    String district;

    @OneToMany
    Member president;
    List<Member> members;

    public Chapter(){};


}
