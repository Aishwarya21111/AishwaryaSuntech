package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

public class Example5 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle volkswagon = new Vehicle();
        volkswagon.setName("Volkswagon");
        Supplier <Vehicle> volkswagonSupplier = () -> volkswagon;

        Supplier <Vehicle> audiSupplier =() -> {
            Vehicle audi = new Vehicle();
            audi.setName("Audi 8");
            return  audi;
        };

        Random random = new Random();
        int RandomNumber = random.nextInt(10);
        System.out.println("the random number is " +RandomNumber);

        if(RandomNumber % 2 == 0){
            context.registerBean("volkswagon", Vehicle.class , volkswagonSupplier);
        }
        else
        {
            context.registerBean("audi" , Vehicle.class , audiSupplier);
        }

        Vehicle volks =null;
        Vehicle audi = null;

        try{
            volks = context.getBean("volkswagon", Vehicle.class);
        }catch (NoSuchBeanDefinitionException nsb){
            System.out.println("error while creating volkswagon vehicle");
        }
        try{
             audi = context.getBean("audi", Vehicle.class);
        }catch (NoSuchBeanDefinitionException nsb){
            System.out.println("error while creating audi vehicle");
        }

        if(null!= volks){
            System.out.println("programming vehicle name from spring context is " + volks.getName());
        }else {
            System.out.println("the programming vehicle name from the spring context is :"+ audi.getName());
        }





        ;







    }
}
