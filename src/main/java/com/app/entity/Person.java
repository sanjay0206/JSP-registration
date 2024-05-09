package com.app.entity;

import java.io.Serializable;

//This is just a simple java class that represents a com.app.entity.Person but it follows the JavaBean specification.

//1. Implements Serializable
//2. No arg constructor
//3. private members w/ getters and setters

//Following that pattern is a good idea for a couple of reasons
// but for this its good because an object needs to be Serializable
//to be sent across data streams.

public class Person implements Serializable {

    // this is push
    private static final long serialVersionUID = 1234567L;
    private String name;
    private String email;

    private int age;

    public Person() {
    }

    public Person(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
