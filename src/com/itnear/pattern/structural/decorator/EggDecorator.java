package com.itnear.pattern.structural.decorator;

/**
 * 描述：鸡蛋装饰者
 * 作者：NearJC
 * 时间：2020/02/18
 */
public class EggDecorator extends AbstractDecrator {

    public EggDecorator(APancake aPancake) {
        super(aPancake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " 加一个鸡蛋";
    }

    @Override
    protected int cost() {
        return super.cost() + 1;
    }
}
