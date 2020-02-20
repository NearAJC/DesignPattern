package com.itnear.pattern.structural.decorator;

/**
 * 描述：火腿装饰者
 * 作者：NearJC
 * 时间：2020/02/18
 */
public class SausageDecorator extends AbstractDecrator {

    public SausageDecorator(APancake aPancake) {
        super(aPancake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " 加一根火腿";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }
}
