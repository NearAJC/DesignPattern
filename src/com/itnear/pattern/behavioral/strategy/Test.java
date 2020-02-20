package com.itnear.pattern.behavioral.strategy;

public class Test {
    public static void main(String[] args) {
        // basicUsage();

        usageFactory();
    }

    private static void basicUsage() {
        PromotionActivity promotionActivity618 = new PromotionActivity(new LiJianPromotionStategy());
        PromotionActivity promotionActivity1111 = new PromotionActivity(new FanXianPromotionStategy());
        promotionActivity618.executePromotionStrategy();
        promotionActivity1111.executePromotionStrategy();
    }

    private static void usageFactory() {
        String promotionKey = "LIJIAN";
        PromotionActivity promotionActivity = new PromotionActivity(PromotionStategyFactory.getPromotionStategy(promotionKey));
        promotionActivity.executePromotionStrategy();
    }
}
