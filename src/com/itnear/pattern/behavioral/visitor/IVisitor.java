package com.itnear.pattern.behavioral.visitor;

/**
 * 描述：访问者接口
 * 作者：NearJC
 * 时间：2020/02/19
 */
public interface IVisitor {

    void visit(FreeCourse freeCourse);

    void visit(CodingCourse codingCourse);
}
