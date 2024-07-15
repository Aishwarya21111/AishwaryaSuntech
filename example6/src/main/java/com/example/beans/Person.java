package com.example.beans;

public class Person {
    public Person() {
        System.out.println("Person bean created by Spring");
    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
