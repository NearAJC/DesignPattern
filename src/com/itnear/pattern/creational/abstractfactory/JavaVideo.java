package com.itnear.pattern.creational.abstractfactory;

/**
 * 描述：java视频类
 * 作者：NearJC
 * 时间：2020/02/16
 */
public class JavaVideo extends Video {

    @Override
    void produce() {
        System.out.println("录制java课程视频");
    }
}
