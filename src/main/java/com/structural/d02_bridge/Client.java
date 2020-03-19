package com.structural.d02_bridge;

import com.structural.d02_bridge.cls.XiaoMi;

/**
 * @author xjn
 * @since 2020-03-19
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new FoldPhone(new XiaoMi());
        phone.call();
    }
}
