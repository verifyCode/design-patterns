package com.creation.d05_builder.build;

/**
 * @author xjn
 * @since 2020-03-18
 */
public class HighHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("高楼地基100米");
    }

    @Override
    public void buildWalls() {
        System.out.println("高楼砌墙200米");
    }

    @Override
    public void roofed() {
        System.out.println("高楼屋顶");
    }
}
