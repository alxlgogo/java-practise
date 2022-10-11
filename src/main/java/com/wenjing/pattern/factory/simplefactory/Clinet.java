package com.wenjing.pattern.factory.simplefactory;

public class Clinet {
    public static void main(String[] args) {
        Vehicle car = SimpleFactory.getInstance("car");
        car.work();
    }
}
