package com.structural.d03_decorator;

import com.structural.d03_decorator.cls.Drink;

/**
 * @author xjn
 * @since 2020-03-19
 */
public class Decorator extends Drink {
    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public float cost() {
        return super.getPrice() + drink.cost();
    }


    @Override
    public String getDesc() {
        return super.getDesc() + "  " + super.getPrice() + "&&" + drink.getDesc();
    }
}
