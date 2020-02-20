package com.itnear.pattern.structural.proxy;

import com.itnear.pattern.structural.proxy.dynamicproxy.OrderServiceDynamicProxy;
import com.itnear.pattern.structural.proxy.staticproxy.OrderServiceStaticProxy;

public class Test {
    public static void main(String[] args) {
//        staticProxyTest();

        dynamicProxyTest();
    }

    private static void staticProxyTest() {
        Order order = new Order();
        order.setUserId(1);
        OrderServiceStaticProxy orderServiceStaticProxy = new OrderServiceStaticProxy();
        orderServiceStaticProxy.saveOrder(order);
    }

    private static void dynamicProxyTest() {
        Order order = new Order();
        order.setUserId(1);
        IOrderService orderServiceDynamicProxy = (IOrderService) new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();
        orderServiceDynamicProxy.saveOrder(order);
    }
}
