package com.google;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile
{
    public static void main(String[] args) {


        //In this type of implementation we need to modify source code to change something:

//        Airtel airtel = new Airtel();
//        airtel.call();
//        airtel.data();
//
//        Jio jio = new Jio();
//        jio.call();
//        jio.data();

        //Good Practice to use interface reference
        //still we need to change source code

//        Sim sim = new Airtel();
//        sim.call();
//        sim.data();


        //Using SpringIOC feature still we need to change source code
        //Since we are using reference object of implemented class

//        ApplicationContext context = new ClassPathXmlApplicationContext("com/google/Container/beans.xml");
//        Airtel air = context.getBean("airtel", Airtel.class);
//        air.call();
//        air.data();

        //BEST IMPLEMENTATION METHOD

        // we create reference to interface while creating objects and using common id in config file
        ApplicationContext context = new ClassPathXmlApplicationContext("com/google/Container/beans.xml");
        Sim sim = context.getBean("sim", Sim.class);
        sim.data();
        sim.call();
    }
}
