package com.itnear.pattern.creational.abstractfactory;

/**
 * 描述：java课程工厂类 - 课程 = 视频 + 手机
 * 作者：NearJC
 * 时间：2020/02/16
 */
public class JavaCourseFactory implements CourseFactory {

    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
