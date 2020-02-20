package com.itnear.pattern.structural.decorator;

/**
 * 描述：抽象的装饰者
 * 作者：NearJC
 * 时间：2020/02/18
 */
public class AbstractDecrator extends APancake {

    private APancake aPancake;

    public AbstractDecrator(APancake aPancake) {
        this.aPancake = aPancake;
    }

    @Override
    protected String getDesc() {
        return aPancake.getDesc();
    }

    @Override
    protected int cost() {
        return aPancake.cost();
    }
}
