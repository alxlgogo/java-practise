package com.wenjing.pattern.builder;

public class CastleBuilder implements HouseBuilder {
    private House house = new House();

    @Override
    public void setFoundation() {
        house.setFoundation("20 meters deep foundation");
    }

    @Override
    public void setWall() {
        house.setWall("Stone wall");
    }

    @Override
    public void setRoof() {
        house.setRoof("stone slabs");
    }

    @Override
    public void setWindows() {
        house.setWindows(100);
    }

    @Override
    public House build() {
        return house;
    }


}
