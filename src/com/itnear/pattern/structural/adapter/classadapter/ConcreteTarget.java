package com.itnear.pattern.structural.adapter.classadapter;

/**
 * 描述：目标接口实现类
 * 作者：NearJC
 * 时间：2020/02/18
 */
public class ConcreteTarget implements Target {

    @Override
    public void request() {
        System.out.println("ConcreteTarget目标方法");
    }
}
