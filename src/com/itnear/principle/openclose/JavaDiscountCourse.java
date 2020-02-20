package com.itnear.principle.openclose;

/**
 * 描述：java折后课程
 * 作者：NearJC
 * 时间：2020/02/15
 */
public class JavaDiscountCourse extends JavaCourse {

    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    /**
     * 获取课程折后价格
     *
     * @return 折后价格
     */
    public Double getDiscountPrice() {
        return super.getPrice()  * 0.8;
    }
}
