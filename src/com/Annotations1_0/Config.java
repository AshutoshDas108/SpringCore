package com.Annotations1_0;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

import java.net.PortUnreachableException;

@Configuration
public class Config
{

    @Bean
    public Principal principalBean(){
        return new Principal();
    }

    @Bean
    public Teacher mathTeacherBean(){
        return new MathTeacher();
    }

    @Bean
    public Teacher physicsTeacherBean(){
        return new PhysicsTeacher();
    }

    @Bean
    public College collegeBean(){
        College c= new College();
        c.setPrincipal(principalBean());
        c.setTeacher(mathTeacherBean());
        return c;
    }

}
