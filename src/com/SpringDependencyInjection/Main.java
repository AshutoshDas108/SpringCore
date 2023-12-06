package com.SpringDependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main(String[] args) {

        //here we are creating object by our own and injecting values by ourselves(hard coding)

//            Student s= new Student();
//            s.setStudentName("Ashutosh");
//            s.setId(159);
//            s.show();

        //We will allow spring to handle these by making changes in config file
        //internally sppring uses the setter function --> setter injection
        //1.creating a container object

//        ApplicationContext context = new ClassPathXmlApplicationContext("com/SpringDependencyInjection/beans.xml");
//        Student s= context.getBean("student1", Student.class);
//        s.show();

        //constructor injection
        //spring internally makes use of constructor to inject values
        ApplicationContext context1 = new ClassPathXmlApplicationContext("com/SpringDependencyInjection/beans.xml");
        Student s1 = context1.getBean("student2", Student.class);
        s1.show();
    }
}
