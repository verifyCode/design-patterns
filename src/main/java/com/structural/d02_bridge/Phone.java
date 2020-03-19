package com.structural.d02_bridge;

import com.structural.d02_bridge.cls.Brand;

/**
 * @author xjn
 * @since 2020-03-19
 */
public abstract class Phone {
    private Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    protected void open() {
        this.brand.open();
    }

    protected void close() {
        this.brand.close();
    }

    protected void call() {
        this.brand.call();
    }
}
