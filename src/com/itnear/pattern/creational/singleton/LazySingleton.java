package com.itnear.pattern.creational.singleton;

/**
 * 描述：懒汉式单例模式 - 使用同步方法
 * 作者：NearJC
 * 时间：2020/02/17
 */
public class LazySingleton {

    private static LazySingleton lazySingleton = null;

    private LazySingleton() {
        // 不是类加载时初始化对象防止反射的解决方法
        if (lazySingleton != null) {
            throw new IllegalArgumentException("单例构造器禁止反射调用");
        }
    }

    /**
     * 懒汉式加载具有延迟加载的作用，只有在使用该对象时才会创建，
     * 添加synchronized关键字可以避免在多线程下出现异常，但会降低效率
     *
     * @return 对象
     */
    public synchronized static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
