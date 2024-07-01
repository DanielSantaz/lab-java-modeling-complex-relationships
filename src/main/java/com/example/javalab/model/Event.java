package com.example.javalab.model;


import jakarta.persistence.Entity;

import java.util.Date;
import java.util.List;

@Entity
public class Event {
    Date date;
    int duration;
    String location;
    String title;
    List<Guest> guests;
}
