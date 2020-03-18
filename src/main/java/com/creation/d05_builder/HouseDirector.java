package com.creation.d05_builder;

import com.creation.d05_builder.build.HouseBuilder;

/**
 * @author xjn
 * @since 2020-03-18
 */
public class HouseDirector {
    HouseBuilder houseBuilder = null;

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //具体建造流程
    public House buildHouse() {
        houseBuilder.buildHouse();
        houseBuilder.buildWalls();
        houseBuilder.buildBasic();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }
}
