package com.wenjing.pattern.factory.factorymethod;

public class FireTruckFactory extends VehicleFactory {
    @Override
    Vehicle createVehicle() {
        return new FireTruck();
    }
}
