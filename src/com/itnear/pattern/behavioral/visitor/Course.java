package com.itnear.pattern.behavioral.visitor;

/**
 * 描述：课程类
 * 作者：NearJC
 * 时间：2020/02/19
 */
public abstract class Course {

    private String name;

    public abstract void accept(IVisitor visitor);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
