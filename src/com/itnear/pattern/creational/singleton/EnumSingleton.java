package com.itnear.pattern.creational.singleton;

/**
 * 描述：枚举单例模式 - 防止反射及反序列化攻击
 * 作者：NearJC
 * 时间：2020/02/17
 */
public class EnumSingleton {

    private EnumSingleton() {

    }

    public static EnumSingleton getInstance() {
        return EnumInstance.INSTANCE.getInstance();
    }

    enum EnumInstance {
        INSTANCE;

        private EnumSingleton enumSingleton;

        EnumInstance() {
            enumSingleton = new EnumSingleton();
        }

        public EnumSingleton getInstance() {
            return enumSingleton;
        }
    }
}
