package com.itnear.pattern.behavioral.visitor;

/**
 * 描述：免费课程类
 * 作者：NearJC
 * 时间：2020/02/19
 */
public class FreeCourse extends Course {

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
