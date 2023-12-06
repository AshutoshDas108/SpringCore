package com.Autowiring;

import org.springframework.beans.factory.annotation.Autowired;


public class Human
{
    private Heart heart;

    public Human() {
    }


    Human(Heart heart){
        this.heart=heart;
    }

    @Autowired
    public void setHeart(Heart heart) {
        this.heart = heart;
    }

    public void heartCheck(){
        if(heart!=null){
            heart.pump();
        }
        else
        {
            System.out.println("DEAD!!!!!");
        }
    }
}
