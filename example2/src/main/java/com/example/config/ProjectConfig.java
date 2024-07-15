package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean(name = "AudiVehicle")
    Vehicle vehicle(){
        var veh = new Vehicle();
        veh.setName("Audi 8 ");
        return veh;
    }

    //use of primary annotation
    //mow we can use getname without specifying bean name

    @Primary
    @Bean(value ="Mercedes")
    Vehicle vehicle2(){
        var veh = new Vehicle();
        veh.setName("Mercedes ");
        return veh;
    }

    @Bean("HondaVehicle")
    Vehicle vehicle3(){
        var veh = new Vehicle();
        veh.setName("honda ");
        return veh;
    }


}
