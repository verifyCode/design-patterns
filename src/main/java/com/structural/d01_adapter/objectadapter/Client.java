package com.structural.d01_adapter.objectadapter;


/**
 * @author xjn
 * @since 2020-03-18
 */
public class Client {
    public static void main(String[] args) {
        PowerAdapter powerAdapter = new PowerAdapter(new AC220());
        powerAdapter.outputDC5V();
    }
}
