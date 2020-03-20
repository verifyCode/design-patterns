package com.structural.d03_decorator.cls;

/**
 * @author xjn
 * @since 2020-03-19
 */
public abstract class Drink {

    public String desc;

    private float price = 0.0f;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    //计算费用的抽象方法
    //子类来实现
    public abstract float cost();

}
