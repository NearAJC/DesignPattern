package com.itnear.pattern.behavioral.visitor;

/**
 * 描述：实战课程类
 * 作者：NearJC
 * 时间：2020/02/19
 */
public class CodingCourse extends Course {

    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
