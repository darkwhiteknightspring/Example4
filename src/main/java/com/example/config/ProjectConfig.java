package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/*

   Primary annotation is used when if we don't mention the name of the bean we still can refer the
   bean annotated with primary annotation.

    When you have multiple beans of the same kind inside the Spring context,
    you can make one of them primary by using @Primary annotation. Primary bean is
    the one which Spring will choose if it has multiple options and you don’t specify a name.
    In other words, it is the default bean that Spring Context will consider in case of
    confusion due to multiple beans present of same type.

*/


@Configuration
public class ProjectConfig {

    @Bean(name="audiVehicle")
    @Primary
    Vehicle vehicle1(){
        var veh = new Vehicle();
        veh.setName("Audi");
        return veh;
    }

    @Bean(value="Honda")
    Vehicle vehicle2(){
        var veh = new Vehicle();
        veh.setName("Honda");
        return veh;
    }

    @Bean("ferrariVehicle")
    Vehicle vehicle3(){
        var veh = new Vehicle();
        veh.setName("Toyota");
        return veh;
    }


}
