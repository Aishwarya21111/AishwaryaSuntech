package com.example.beans;

import org.springframework.stereotype.Component;

@Component
public class Vehicle {

    private String name ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  static void name(){

    }
    public static void printHello(){
        System.out.println("Print hello from the component vehicle bean");
    }
}
