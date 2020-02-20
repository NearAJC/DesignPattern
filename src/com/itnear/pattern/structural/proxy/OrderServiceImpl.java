package com.itnear.pattern.structural.proxy;

/**
 * 描述：订单业务实现类
 * 作者：NearJC
 * 时间：2020/02/20
 */
public class OrderServiceImpl implements IOrderService {

    private IOrderDao iOrderDao;

    @Override
    public int saveOrder(Order order) {
        iOrderDao = new OrderDaoImpl();
        System.out.println("Service调用Dao层");
        return iOrderDao.insertOrder(order);
    }
}
