package com.LooseCouplingExample;

public class MissedCallAlertService implements Service{
    @Override
    public void service() {
        System.out.println("Missed Call Alert Service");
    }
}
