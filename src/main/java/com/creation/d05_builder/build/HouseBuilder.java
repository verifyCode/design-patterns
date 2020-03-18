package com.creation.d05_builder.build;

import com.creation.d05_builder.House;

/**
 * @author xjn
 * @since 2020-03-18
 */
public abstract class HouseBuilder {
    protected House house = new House();


    public abstract void buildBasic();

    public abstract void buildWalls();

    public abstract void roofed();


    public House buildHouse() {
        return house;
    }
}
