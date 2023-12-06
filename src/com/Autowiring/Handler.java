package com.Autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Handler
{
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/Autowiring/beans.xml");
        Human h = context.getBean("human", Human.class);
        h.heartCheck();
    }
}
