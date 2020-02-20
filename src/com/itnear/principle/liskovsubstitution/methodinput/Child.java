package com.itnear.principle.liskovsubstitution.methodinput;

import java.util.HashMap;
import java.util.Map;

/**
 * 描述：子类 - 输入参数
 * 作者：NearJC
 * 时间：2020/02/16
 */
public class Child extends Base {

    /**
     * 子类重载父类方法时，输入参数范围要比父类大
     *
     * @param map map对象
     */
    public void method(Map map) {
        System.out.println("子类入参方法被执行");
    }
}
