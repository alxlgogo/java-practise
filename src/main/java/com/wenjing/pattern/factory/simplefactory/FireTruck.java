package com.wenjing.pattern.factory.simplefactory;

public class FireTruck implements Vehicle {
    @Override
    public void work() {
        System.out.println("FireTruck , transporting firefighters and water for putting out fires.");
    }
}
