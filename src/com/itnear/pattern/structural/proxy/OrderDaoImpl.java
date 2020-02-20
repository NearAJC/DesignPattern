package com.itnear.pattern.structural.proxy;

/**
 * 描述：订单操作实现类
 * 作者：NearJC
 * 时间：2020/02/20
 */
public class OrderDaoImpl implements IOrderDao {

    @Override
    public int insertOrder(Order order) {
        System.out.println("Dao添加Order成功");
        return 1;
    }
}
