package com.creation.d05_builder;

import com.creation.d05_builder.build.CommonHouse;

/**
 * @author xjn
 * @since 2020-03-18
 */
public class Client {
    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        House house = houseDirector.buildHouse();
    }
}
