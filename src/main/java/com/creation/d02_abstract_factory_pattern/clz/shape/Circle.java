package com.creation.d02_abstract_factory_pattern.clz.shape;

/**
 * @author xjn
 * @since 2020-01-06
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
