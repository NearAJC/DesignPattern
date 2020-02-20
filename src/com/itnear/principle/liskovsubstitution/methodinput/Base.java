package com.itnear.principle.liskovsubstitution.methodinput;

import java.util.HashMap;

/**
 * 描述：父类 - 输入参数
 * 作者：NearJC
 * 时间：2020/02/16
 */
public class Base {

    public void method(HashMap hashMap) {
        System.out.println("父类被执行");
    }
}
