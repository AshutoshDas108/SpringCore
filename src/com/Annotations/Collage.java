package com.Annotations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component("collageBean")
public class Collage {
    public void test(){
        System.out.println("Test Function worked....");
    }
}
