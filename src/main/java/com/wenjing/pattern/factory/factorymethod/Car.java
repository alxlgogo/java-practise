package com.wenjing.pattern.factory.factorymethod;

public class Car implements Vehicle {
    @Override
    public void work() {
        System.out.println("Car , Motor vehicle that is used for transportation.");
    }
}
