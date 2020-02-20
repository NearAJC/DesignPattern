package com.itnear.pattern.creational.singleton;

/**
 * 描述：静态内部类单例模式 - 基于类初始化的延迟加载
 * 作者：NearJC
 * 时间：2020/02/17
 */
public class StaticInnerClassSingleton {

    private StaticInnerClassSingleton() {
        // 类加载初始化对象防止反射的解决方法
        if (InnerClass.staticInnerClassSingleton != null) {
            throw new IllegalArgumentException("单例构造器禁止反射调用");
        }
    }

    /**
     * 静态内部类具有Class对象的初始化锁
     * <p>
     * 5种情况初始化类：
     * >>1、类的实例被创建
     * >>2、类中的静态方法被调用
     * >>3、类中的静态成员被赋值
     * >>4、类中的静态成员被使用，并且该成员不是常量成员
     * >>5、类中有嵌套的断言语句
     */
    private static class InnerClass {
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance() {
        return InnerClass.staticInnerClassSingleton;
    }
}
