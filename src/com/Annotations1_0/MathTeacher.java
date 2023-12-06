package com.Annotations1_0;

import org.springframework.context.annotation.Primary;

public class MathTeacher implements Teacher
{
    @Override
    public void teach() {
        System.out.println("I'm Maths Teacher....");
    }
}
