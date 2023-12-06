package com.google;

public class Airtel  implements Sim
{

    @Override
    public void call() {
        System.out.println("Calling via Airtel Sim");
    }

    @Override
    public void data() {
        System.out.println("Browsing via Airtel Sim");
    }
}
