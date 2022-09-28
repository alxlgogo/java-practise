package com.wenjing.pattern.builder;

public class Director {
    public void construct(HouseBuilder houseBuilder) {
        houseBuilder.setRoof();
        houseBuilder.setWindows();
        houseBuilder.setWall();
        houseBuilder.setFoundation();
    }
}
