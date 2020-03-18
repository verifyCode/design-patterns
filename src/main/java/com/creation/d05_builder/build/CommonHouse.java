package com.creation.d05_builder.build;


/**
 * @author xjn
 * @since 2020-03-18
 */
public class CommonHouse extends HouseBuilder {

    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基5米");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子砌墙10米");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子屋顶");
    }

}
