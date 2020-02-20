package com.itnear.pattern.creational.singleton;

/**
 * 描述：懒汉式单例模式 - 双重检查锁
 * 作者：NearJC
 * 时间：2020/02/17
 */
public class LazyDoubleCheckSingleton {

    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton;

    private LazyDoubleCheckSingleton() {

    }

    /**
     * 懒汉式加载具有延迟加载的作用，只有在使用该对象时才会创建，
     * 添加双重检查锁，增加了安全性和效率
     *
     * @return 对象
     */
    public static LazyDoubleCheckSingleton getInstance() {
        if (lazyDoubleCheckSingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazyDoubleCheckSingleton == null) {
                    // lazyDoubleCheckSingleton对象添加volatile关键字用来禁止虚拟机进行重排序,创建对象的步骤：
                    // 1、分配内存给这个对象
                    // 2、初始化对象
                    // 3、设置lazyDoubleCheckSingleton指向分配的内存
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}
