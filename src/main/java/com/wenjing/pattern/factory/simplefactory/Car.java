package com.wenjing.pattern.factory.simplefactory;

public class Car implements Vehicle {
    @Override
    public void work() {
        System.out.println("Car , Motor vehicle that is used for transportation.");
    }
}
