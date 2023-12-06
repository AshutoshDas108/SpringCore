package com.Annotations1_0;

import org.springframework.context.annotation.Primary;

public class PhysicsTeacher implements Teacher{
    @Override
    public void teach() {
        System.out.println("I'm Physics teacher...");
    }
}
