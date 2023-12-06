package com.LooseCouplingExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Handler
{
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/LooseCouplingExample/beans.xml");
        System.out.println("Container object created successfully!");
        Airtel airtel = context.getBean("air", Airtel.class);
        airtel.activateService();
    }
}
