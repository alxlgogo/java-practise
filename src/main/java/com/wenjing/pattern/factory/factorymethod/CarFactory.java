package com.wenjing.pattern.factory.factorymethod;

public class CarFactory extends VehicleFactory{
    @Override
    Vehicle createVehicle() {
        return new Car();
    }
}
