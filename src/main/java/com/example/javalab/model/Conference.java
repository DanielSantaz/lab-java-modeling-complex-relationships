package com.example.javalab.model;


import jakarta.persistence.Entity;

import java.util.List;

@Entity
public class Conference extends Event{
    private List<Speaker> speakers;
}
