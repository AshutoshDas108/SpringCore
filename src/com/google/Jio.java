package com.google;

public class Jio implements Sim{
    @Override
    public void call() {
        System.out.println("Calling Via Jio");
    }

    @Override
    public void data() {
        System.out.println("Browsing via Jio");
    }
}
