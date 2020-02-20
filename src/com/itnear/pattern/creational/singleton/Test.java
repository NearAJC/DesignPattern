package com.itnear.pattern.creational.singleton;

import java.io.*;
import java.lang.reflect.Constructor;

public class Test {
    public static void main(String[] args) throws Exception {
        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        t1.start();
        t2.start();
        System.out.println("program end");

        // 序列化测试
        // testSerializable();

        // 反射测试
        // testReflex();
    }

    /**
     * 序列化测试，解决方法就是重写readResolve()方法
     */
    private static void testSerializable() throws Exception {
        HungrySingleton instance = HungrySingleton.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
        oos.writeObject(instance);

        File file = new File("singleton_file");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        HungrySingleton newInstance = (HungrySingleton) ois.readObject();
        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);
    }

    /**
     * 反射破坏单例测试
     */
    private static void testReflex() throws Exception {
        // 类加载时初始化对象的情况，可以避免反射攻击
        HungrySingleton instance = HungrySingleton.getInstance();
        Class<HungrySingleton> hungrySingletonClass = HungrySingleton.class;
        Constructor<HungrySingleton> constructor = hungrySingletonClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        HungrySingleton newInstance = constructor.newInstance();

        // 不在类加载时初始化对象的情况，不管是添加标识变量，都可以被反射攻击，所以这种单例无法避免被反射
        // LazySingleton instance = LazySingleton.getInstance();
        // Class<LazySingleton> lazySingletonClass = LazySingleton.class;
        // Constructor<LazySingleton> constructor = lazySingletonClass.getDeclaredConstructor();
        // constructor.setAccessible(true);
        // LazySingleton newInstance = constructor.newInstance();

        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);
    }
}
