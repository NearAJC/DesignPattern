package com.itnear.pattern.creational.factorymethod;

/**
 * 描述：java视频抽象类
 * 作者：NearJC
 * 时间：2020/02/16
 */
public class JavaVideo extends Video {

    @Override
    void produce() {
        System.out.println("正在录制java的视频");
    }
}
