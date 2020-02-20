package com.itnear.pattern.creational.factorymethod;

/**
 * 描述：python视频工厂类
 * 作者：NearJC
 * 时间：2020/02/16
 */
public class PythonVideoFactory extends VideoFactory {

    @Override
    Video getVideo() {
        return new PythonVideo();
    }
}
