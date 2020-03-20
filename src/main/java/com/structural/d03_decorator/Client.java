package com.structural.d03_decorator;

import com.structural.d03_decorator.cls.Drink;
import com.structural.d03_decorator.cls.LongBlack;

/**
 * @author xjn
 * @since 2020-03-19
 */
public class Client {

    public static void main(String[] args) {
//        private Drink drink;
//
//        public Decorator(Drink drink) {
//            this.drink = drink;
//        }
        //点一杯咖啡
        Drink order = new LongBlack();
        System.out.println(order.getDesc());
        System.out.println(order.cost());

        //加一分牛奶
        order = new Milk(order);
        System.out.println(order.getDesc());
        System.out.println(order.cost());

        order = new Soy(order);
        order = new Soy(order);
        System.out.println(order.getDesc());
        System.out.println(order.cost());

    }
}
