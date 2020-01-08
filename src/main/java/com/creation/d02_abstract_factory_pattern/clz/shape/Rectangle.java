package com.creation.d02_abstract_factory_pattern.clz.shape;

/**
 * @author xjn
 * @since 2020-01-08
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
