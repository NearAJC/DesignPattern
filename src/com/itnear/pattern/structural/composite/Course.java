package com.itnear.pattern.structural.composite;

/**
 * 描述：课程类
 * 作者：NearJC
 * 时间：2020/02/18
 */
public class Course extends CatalogComponent {

    private String name;

    private double price;

    public Course(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName(CatalogComponent catalogComponent) {
        return this.name;
    }

    @Override
    public double getPrice(CatalogComponent catalogComponent) {
        return this.price;
    }

    @Override
    public void print() {
        System.out.println("course name:" + this.name + " course price:" + this.price);
    }
}
