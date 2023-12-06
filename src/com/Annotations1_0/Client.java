package com.Annotations1_0;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client
{
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        System.out.println("Container Object is created....");
        College col = context.getBean("collegeBean", College.class);
        col.collegeInfo();
    }
}
