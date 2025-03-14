package com.example.SpaceMnagementService.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "spaces")
public class Space {

    //    represent the primary key
    @Id
//    what is the generative value strategy
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @Column(name="name")
    private String name;
    @Column(name="location")
    private String location;
    @Column(name="capacity")
    private int capacity;
    @Column(name="price_per_hour")
    private double price_per_hour;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getPrice_per_hour() {
        return price_per_hour;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setPrice_per_hour(double price_per_hour) {
        this.price_per_hour = price_per_hour;
    }

    public void setName(String name) {
         this.name= name;
    }
}



