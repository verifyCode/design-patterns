package com.structural.d03_decorator.cls;

/**
 * @author xjn
 * @since 2020-03-19
 */
public class Coffee extends Drink {
    @Override
    public float cost() {
        return super.getPrice();
    }
}
