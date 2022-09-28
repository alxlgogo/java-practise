package com.wenjing.pattern.builder;

public class HutBuilder implements HouseBuilder{
    private House house = new House();
    @Override
    public void setFoundation() {
        house.setFoundation("No foundation");
    }

    @Override
    public void setWall() {
        house.setWall("Bricks");
    }

    @Override
    public void setRoof() {
        house.setRoof("Wood");
    }

    @Override
    public void setWindows() {
        house.setWindows(1);
    }

    @Override
    public House build() {
        return house;
    }
}
