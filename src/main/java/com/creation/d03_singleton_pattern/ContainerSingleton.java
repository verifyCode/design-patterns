package com.creation.d03_singleton_pattern;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author xjn
 * @since 2020-01-09
 * 容器单例
 */
public class ContainerSingleton {

    private ContainerSingleton() {

    }

    private static final Map<String, Object> map = new ConcurrentHashMap<>();

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
