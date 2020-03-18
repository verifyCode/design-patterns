package com.creation.d03_singleton_pattern;

/**
 * @author xjn
 * @since 2020-03-18
 */
public class EHanSingleton {
    private EHanSingleton() {

    }

    private final static EHanSingleton instance = new EHanSingleton();

    public EHanSingleton getInstance() {
        return instance;
    }

}
