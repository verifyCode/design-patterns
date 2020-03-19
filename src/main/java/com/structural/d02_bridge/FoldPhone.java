package com.structural.d02_bridge;

import com.structural.d02_bridge.cls.Brand;

/**
 * @author xjn
 * @since 2020-03-19
 */
public class FoldPhone extends Phone {
    public FoldPhone(Brand brand) {
        super(brand);
    }

    public void open() {
        super.open();
        System.out.println("折叠手机");
    }

    public void close() {
        super.close();
        System.out.println("折叠手机");
    }

    public void call() {
        super.call();
        System.out.println("折叠手机");
    }
}
