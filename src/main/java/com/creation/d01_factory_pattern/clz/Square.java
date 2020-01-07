package com.creation.d01_factory_pattern.clz;

/**
 * @author xjn
 * @since 2020-01-06
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
