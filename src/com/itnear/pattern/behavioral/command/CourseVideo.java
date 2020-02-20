package com.itnear.pattern.behavioral.command;

/**
 * 描述：课程类
 * 作者：NearJC
 * 时间：2020/02/19
 */
public class CourseVideo {

    private String name;

    public CourseVideo(String name) {
        this.name = name;
    }

    public void open() {
        System.out.println(this.name + "开放");
    }

    public void close() {
        System.out.println(this.name + "关闭");
    }
}
