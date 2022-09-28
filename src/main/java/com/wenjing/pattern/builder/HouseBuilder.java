package com.wenjing.pattern.builder;

public interface HouseBuilder {
    void setFoundation();

    void setWall();

    void setRoof();

    void setWindows();

    House build();

}
