package com.itnear.pattern.structural.proxy.staticproxy;

import com.itnear.pattern.structural.proxy.IOrderService;
import com.itnear.pattern.structural.proxy.Order;
import com.itnear.pattern.structural.proxy.OrderServiceImpl;

/**
 * 描述：订单业务静态代理类
 * 作者：NearJC
 * 时间：2020/02/20
 */
public class OrderServiceStaticProxy {

    private IOrderService iOrderService;

    public int saveOrder(Order order) {
        iOrderService = new OrderServiceImpl();
        beforeMethod(order);
        int result = iOrderService.saveOrder(order);
        afterMethod();
        return result;
    }

    private void beforeMethod(Order order) {
        int userId = order.getUserId();
        int dbRouter = userId % 2;
        System.out.println("静态代理分配到[db" + dbRouter + "]处理数据");
        System.out.println("静态代理before code");
    }

    private void afterMethod() {
        System.out.println("静态代理after code");
    }
}
