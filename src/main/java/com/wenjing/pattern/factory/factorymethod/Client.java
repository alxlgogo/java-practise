package com.wenjing.pattern.factory.factorymethod;

public class Client {
    private static Vehicle vehicle;

    public static void main(String[] args) {
        createVehicle("car");
        vehicle.work();

        createVehicle("fireTruck");
        vehicle.work();
    }

    public static void createVehicle(String vehicleType) {
        if ("car".equals(vehicleType)) {
            vehicle = new CarFactory().createVehicle();
        } else if ("fireTruck".equals(vehicleType)) {
            vehicle = new FireTruckFactory().createVehicle();
        }
    }
}
