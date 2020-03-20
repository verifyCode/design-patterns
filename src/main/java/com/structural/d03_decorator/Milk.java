package com.structural.d03_decorator;

import com.structural.d03_decorator.cls.Drink;

/**
 * @author xjn
 * @since 2020-03-19
 */
public class Milk extends Decorator {
    public Milk(Drink drink) {
        super(drink);
        super.setDesc("牛奶");
        setPrice(0.2f);
    }
}
