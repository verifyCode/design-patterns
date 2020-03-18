package com.creation.d03_singleton_pattern;

/**
 * @author xjn
 * @since 2020-03-18
 */
public class LanHanSingleton {

    private LanHanSingleton() {

    }

    private static volatile LanHanSingleton instance;

    public static LanHanSingleton getInstance() {
        if (instance == null) {
            synchronized (LanHanSingleton.class) {
                if (instance == null) {
                    instance = new LanHanSingleton();
                }
            }
        }
        return instance;
    }
}
