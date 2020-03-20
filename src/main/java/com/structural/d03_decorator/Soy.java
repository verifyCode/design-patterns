package com.structural.d03_decorator;

import com.structural.d03_decorator.cls.Drink;

/**
 * @author xjn
 * @since 2020-03-19
 */
public class Soy extends Decorator {
    public Soy(Drink drink) {
        super(drink);
        setDesc("豆浆");
        setPrice(1.5f);
    }
}
