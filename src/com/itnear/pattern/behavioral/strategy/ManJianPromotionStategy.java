package com.itnear.pattern.behavioral.strategy;

/**
 * 描述：满减促销类
 * 作者：NearJC
 * 时间：2020/02/20
 */
public class ManJianPromotionStategy implements PromotionStategy {

    @Override
    public void doPromotion() {
        System.out.println("满减促销类，满200减20元");
    }
}
