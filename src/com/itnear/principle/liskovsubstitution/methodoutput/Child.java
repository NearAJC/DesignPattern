package com.itnear.principle.liskovsubstitution.methodoutput;

import java.util.HashMap;

/**
 * 描述：子类 - 输出参数
 * 作者：NearJC
 * 时间：2020/02/16
 */
public class Child extends Base {

    /**
     * 子类重写父类方法时，输出参数范围要比父类小
     *
     * @return hashMap对象
     */
    @Override
    public HashMap method() {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        System.out.println("子类method被执行");
        hashMap.put("message", "子类method被执行");
        return hashMap;
    }
}
