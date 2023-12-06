package com.Annotations2_0;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("teacherBean")
@Primary
public class MathTeacher implements Teacher{
    @Override
    public void teach() {
        System.out.println("I am Maths Teacher...");
    }
}
