package com.creation.d03_singleton_pattern;

/**
 * @author xjn
 * @since 2020-03-18
 */
public class EHanSingleton2 {
    private EHanSingleton2() {

    }

    private static final EHanSingleton2 instance;

    static {
        instance = new EHanSingleton2();
    }

    public EHanSingleton2 getInstance() {
        return instance;
    }
}
