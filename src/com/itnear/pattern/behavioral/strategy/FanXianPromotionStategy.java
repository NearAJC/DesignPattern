package com.itnear.pattern.behavioral.strategy;

/**
 * 描述：返现促销类
 * 作者：NearJC
 * 时间：2020/02/20
 */
public class FanXianPromotionStategy implements PromotionStategy {

    @Override
    public void doPromotion() {
        System.out.println("返现促销，返回金额存放到用户金额中");
    }
}
