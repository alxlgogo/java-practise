package com.wenjing.pattern.factory.factorymethod;

public class FireTruck implements Vehicle {
    @Override
    public void work() {
        System.out.println("FireTruck , transporting firefighters and water for putting out fires.");
    }
}
