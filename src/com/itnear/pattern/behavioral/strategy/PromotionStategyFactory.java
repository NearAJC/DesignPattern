package com.itnear.pattern.behavioral.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * 描述：促销策略工厂类
 * 作者：NearJC
 * 时间：2020/02/20
 */
public class PromotionStategyFactory {

    private static Map<String, PromotionStategy> PROMOTION_STATEGY_FACTORY = new HashMap<String, PromotionStategy>();

    private static final EmptyPromotionStategy NON_PROMOTION = new EmptyPromotionStategy();

    static {
        PROMOTION_STATEGY_FACTORY.put(PromotionKey.LIJIAN, new LiJianPromotionStategy());
        PROMOTION_STATEGY_FACTORY.put(PromotionKey.FANXIAN, new FanXianPromotionStategy());
        PROMOTION_STATEGY_FACTORY.put(PromotionKey.MANJIAN, new ManJianPromotionStategy());
    }

    private PromotionStategyFactory() {

    }

    public static PromotionStategy getPromotionStategy(String promotionKey) {
        PromotionStategy promotionStategy = PROMOTION_STATEGY_FACTORY.get(promotionKey);
        return promotionStategy == null ? NON_PROMOTION : promotionStategy;
    }

    private interface PromotionKey {
        String LIJIAN = "LIJIAN";
        String FANXIAN = "FANXIAN";
        String MANJIAN = "MANJIAN";
    }
}
