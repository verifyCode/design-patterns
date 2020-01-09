package com.creation.d03_singleton_pattern;

import java.util.HashMap;

/**
 * @author xjn
 * @since 2020-01-09
 * 容器单例
 */
public class ContainerSingleton {

    private ContainerSingleton() {

    }

    private static final HashMap<String, Object> map = new HashMap<>();

    public static void putInstance(String key, Object instance) {
        if (map.containsKey(key)) {
            return;
        } else {
            map.put(key, instance);
        }
    }

    public static Object getInstance(String key) {
        return map.get(key);
    }
}
