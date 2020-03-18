package com.creation.d03_singleton_pattern;

/**
 * @author xjn
 * @since 2020-03-18
 */
public enum EnumSingleton {
    INSTANCE;
    private Object object = null;

    private EnumSingleton() {
        object = new Object();
    }

    public Object getInstance() {
        return object;
    }

    public static void main(String[] args) {
        Object instance1 = EnumSingleton.INSTANCE.getInstance();
        Object instance2 = EnumSingleton.INSTANCE.getInstance();
        System.out.println(instance1.equals(instance2));
    }
}
