package com.itnear.principle.openclose;

public class Test {
    public static void main(String[] args) {
        JavaDiscountCourse javaCourse = new JavaDiscountCourse(96, "Java编程思想", 348d);
        System.out.println("课堂ID:" + javaCourse.getId() + "，课程名称:" + javaCourse.getName()
                + "课程原价：" + javaCourse.getPrice() + "元，" + "，课程折后价格：" + javaCourse.getDiscountPrice() + "元");
    }
}
