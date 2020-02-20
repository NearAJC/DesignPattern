package com.itnear.principle.singlersponsibility;

import com.itnear.principle.singlersponsibility.clazz.Bird;
import com.itnear.principle.singlersponsibility.clazz.FlyBird;
import com.itnear.principle.singlersponsibility.clazz.WalkBird;

public class Test {
    public static void main(String[] args) {
        // 不遵守单一职责的情况
        Bird bird = new Bird();
        bird.mainMoveMode("大雁");
        bird.mainMoveMode("鸵鸟");

        // 将职责分开
        FlyBird flyBird = new FlyBird();
        flyBird.mainMoveMode("大雁");

        WalkBird walkBird = new WalkBird();
        walkBird.mainMoveMode("鸵鸟");
    }
}
