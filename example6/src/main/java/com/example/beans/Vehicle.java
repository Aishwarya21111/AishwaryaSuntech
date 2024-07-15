package com.example.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;


public class Vehicle {

    private String name ;

    public Vehicle() {
        System.out.println("vehicle bean created by spring");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "vehicle name is "+ name;
    }
}
