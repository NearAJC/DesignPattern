package com.itnear.pattern.behavioral.visitor;

/**
 * 描述：访问者实现类
 * 作者：NearJC
 * 时间：2020/02/19
 */
public class Visitor implements IVisitor {

    @Override
    public void visit(FreeCourse freeCourse) {
        System.out.println("免费课程：" + freeCourse.getName());
    }

    @Override
    public void visit(CodingCourse codingCourse) {
        System.out.println("实战课程：" + codingCourse.getName() + "，价格：" + codingCourse.getPrice());
    }
}
