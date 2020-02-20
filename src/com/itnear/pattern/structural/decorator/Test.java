package com.itnear.pattern.structural.decorator;

public class Test {
    public static void main(String[] args) {
        APancake aPancake = new Pancake();
        aPancake = new EggDecorator(aPancake);
        aPancake = new EggDecorator(aPancake);
        aPancake = new EggDecorator(aPancake);
        aPancake = new SausageDecorator(aPancake);
        System.out.println(aPancake.getDesc() + ",销售价格：" + aPancake.cost());
    }
}
