package com.Annotations2_0;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class PhysicsTeacher implements  Teacher{
    @Override
    public void teach() {
        System.out.println("I am physics teacher....");
    }
}
