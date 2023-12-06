package com.PropertiesFile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientHandler
{
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("com/PropertiesFile/beans.xml");
        System.out.println("Container object is created.....");
        Student s=context.getBean("student", Student.class);
        s.displayStudentInfo();

    }
}
