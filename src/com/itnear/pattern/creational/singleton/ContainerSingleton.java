package com.itnear.pattern.creational.singleton;

import com.sun.deploy.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 描述：容器单例模式
 * 作者：NearJC
 * 时间：2020/02/17
 */
public class ContainerSingleton {

    /**
     * 容器
     */
    private static Map<String, Object> singletonMap = new HashMap<String, Object>();

    private ContainerSingleton() {

    }

    /**
     * 存储实例对象instance
     *
     * @param key      键
     * @param instance 实例对象
     */
    public static void putInstance(String key, Object instance) {
        if (key != null && !"".equals(key) && instance != null) {
            if (!singletonMap.containsKey(key)) {
                singletonMap.put(key, instance);
            }
        }
    }

    /**
     * 根据键key获取实例对象
     *
     * @param key 键
     * @return 实例对象
     */
    public static Object getInstance(String key) {
        return singletonMap.get(key);
    }
}
