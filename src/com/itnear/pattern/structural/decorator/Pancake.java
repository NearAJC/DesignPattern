package com.itnear.pattern.structural.decorator;

/**
 * 描述：煎饼实现类
 * 作者：NearJC
 * 时间：2020/02/18
 */
public class Pancake extends APancake {
    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected int cost() {
        return 8;
    }
}
