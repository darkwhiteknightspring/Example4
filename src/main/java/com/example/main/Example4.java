package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example4 {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle veh1 = context.getBean("audiVehicle", Vehicle.class);
        System.out.println(veh1.getName());
        Vehicle veh2 = context.getBean("Honda",Vehicle.class);
        System.out.println(veh2.getName());
        Vehicle veh3 = context.getBean("ferrariVehicle",Vehicle.class);
        System.out.println(veh3.getName());
        Vehicle veh4 = context.getBean(Vehicle.class);
        System.out.println(veh4.getName());

    }
}
