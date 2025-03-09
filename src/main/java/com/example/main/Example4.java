package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*
    Sometimes automatic configuration is not an option. When? Let's imagine that you want to wire components from 3rd-party libraries (you don't have the source code so you can't annotate its classes with @Component), so automatic configuration is not possible.

    The @Bean annotation returns an object that spring should register as bean in application context. The body of the method bears the logic responsible for creating the instance.

    With @Bean you can have multiple beans while with component you can only have one bean

 */


public class Example4 {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle veh = context.getBean(Vehicle.class);
        System.out.println("Component vehicle name from spring context is:" + veh.getName());
        veh.printHello();

    }
}
