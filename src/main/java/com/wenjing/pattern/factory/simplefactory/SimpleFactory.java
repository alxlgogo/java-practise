package com.wenjing.pattern.factory.simplefactory;

public class SimpleFactory {
    public static Vehicle getInstance(String vehicleType) {
        if ("car".equals(vehicleType)) {
            return new Car();
        } else if ("fireTruck".equals(vehicleType)) {
            return new FireTruck();
        }
        return null;
    }
}
