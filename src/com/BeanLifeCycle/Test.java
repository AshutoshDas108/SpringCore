package com.BeanLifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class Test
{
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        ApplicationContext context = new ClassPathXmlApplicationContext("com/BeanLifeCycle/beans.xml");
        StudentDAO s = context.getBean("dao", StudentDAO.class);
        s.selectAllRows();

    }
}
