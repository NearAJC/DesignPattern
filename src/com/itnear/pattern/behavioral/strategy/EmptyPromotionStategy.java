package com.itnear.pattern.behavioral.strategy;

/**
 * 描述：空策略类
 * 作者：NearJC
 * 时间：2020/02/20
 */
public class EmptyPromotionStategy implements PromotionStategy {

    @Override
    public void doPromotion() {
        System.out.println("无促销活动");
    }
}
