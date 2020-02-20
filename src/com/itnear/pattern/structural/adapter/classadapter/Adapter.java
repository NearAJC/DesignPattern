package com.itnear.pattern.structural.adapter.classadapter;

/**
 * 描述：适配器类
 * 作者：NearJC
 * 时间：2020/02/18
 */
public class Adapter extends Adaptee implements Target {

    @Override
    public void request() {
        super.adapteeRequest();
    }
}
