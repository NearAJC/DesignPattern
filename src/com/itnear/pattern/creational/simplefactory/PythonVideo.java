package com.itnear.pattern.creational.simplefactory;

/**
 * 描述： python视频抽象类
 * 作者：NearJC
 * 时间：2020/02/16
 */
public class PythonVideo extends Video {

    @Override
    void produce() {
        System.out.println("正在录制python的视频");
    }
}
