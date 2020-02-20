package com.itnear.pattern.creational.singleton;

/**
 * 描述：线程测试类
 * 作者：NearJC
 * 时间：2020/02/17
 */
public class T implements Runnable {

    @Override
    public void run() {
        // LazySingleton instance = LazySingleton.getInstance();
        // LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();
        // StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
        // EnumSingleton instance = EnumSingleton.getInstance();
        ContainerSingleton.putInstance("object", new Object());
        Object instance = ContainerSingleton.getInstance("object");
        System.out.println("Thread name:" + Thread.currentThread().getName() + "，实例化对象：" + instance);
    }
}
