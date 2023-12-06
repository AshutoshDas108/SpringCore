package com.Annotations2_0;

import org.springframework.stereotype.Component;

@Component("teacherBean")
public class PhysicsTeacher implements  Teacher{
    @Override
    public void teach() {
        System.out.println("I am physics teacher....");
    }
}
