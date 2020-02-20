package com.itnear.pattern.behavioral.strategy;

/**
 * 描述：立减促销类
 * 作者：NearJC
 * 时间：2020/02/20
 */
public class LiJianPromotionStategy implements PromotionStategy {

    @Override
    public void doPromotion() {
        System.out.println("立减促销类，课程价格直减去配置的价格");
    }
}
