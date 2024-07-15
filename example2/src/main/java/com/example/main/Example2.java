package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example2 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh = context.getBean("HondaVehicle",Vehicle.class);
        System.out.println("vehicle name is "+ veh.getName());

        Vehicle veh1 = context.getBean("AudiVehicle", Vehicle.class);
        System.out.println(veh1.getName());

        //implementation of @Primary
        Vehicle veh3 = context.getBean(Vehicle.class);
        System.out.println(veh3.getName());





    }
}
