package com.itnear.pattern.behavioral.templatemethod;

/**
 * 描述：设计模式课程类
 * 作者：NearJC
 * 时间：2020/02/20
 */
public class DesignPatternCourse extends ACourse {

    @Override
    void packageCourse() {
        System.out.println("提供源代码");
    }

    @Override
    protected boolean needWriteArticle() {
        return true;
    }
}
