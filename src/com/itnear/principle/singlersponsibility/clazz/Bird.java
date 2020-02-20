package com.itnear.principle.singlersponsibility.clazz;

/**
 * 描述：鸟类 - 不遵守单一职责的情况
 * 作者：NearJC
 * 时间：2020/02/16
 */
public class Bird {

    public void mainMoveMode(String birdName) {
        if ("鸵鸟".equals(birdName)) {
            System.out.println(birdName + "用脚走");
        } else {
            System.out.println(birdName + "用翅膀飞");
        }
    }
}
