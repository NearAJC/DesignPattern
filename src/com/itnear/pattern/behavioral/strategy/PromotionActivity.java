package com.itnear.pattern.behavioral.strategy;

/**
 * 描述：促销活动类
 * 作者：NearJC
 * 时间：2020/02/20
 */
public class PromotionActivity {

    private PromotionStategy promotionStategy;

    public PromotionActivity(PromotionStategy promotionStategy) {
        this.promotionStategy = promotionStategy;
    }

    public void executePromotionStrategy() {
        promotionStategy.doPromotion();
    }
}
