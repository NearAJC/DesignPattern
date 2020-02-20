package com.itnear.pattern.creational.singleton;

import java.io.Serializable;

/**
 * 描述：饿汉式单例模式
 * 作者：NearJC
 * 时间：2020/02/17
 */
public class HungrySingleton implements Serializable {
    private final static HungrySingleton hungrySingleton;

    static {
        hungrySingleton = new HungrySingleton();
    }

    private HungrySingleton() {
        // 类加载初始化对象防止反射的解决方法
        if (hungrySingleton != null) {
            throw new IllegalArgumentException("单例构造器禁止反射调用");
        }
    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

    /**
     * 解决序列化破坏单例问题
     *
     * @return 实例对象
     */
    public Object readResolve() {
        return hungrySingleton;
    }
}
