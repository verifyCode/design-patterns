package com.structural.d01_adapter.classadapter;

/**
 * @author xjn
 * @since 2020-03-18
 */
public class Client {
    public static void main(String[] args) {
        DC5 dc5 = new PowerAdapter();
        dc5.outputDC5V();
    }
}
