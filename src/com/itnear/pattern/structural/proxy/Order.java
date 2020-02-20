package com.itnear.pattern.structural.proxy;

/**
 * 描述：订单类
 * 作者：NearJC
 * 时间：2020/02/20
 */
public class Order {

    private Object orderInfo;

    private Integer userId;

    public Object getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(Object orderInfo) {
        this.orderInfo = orderInfo;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
