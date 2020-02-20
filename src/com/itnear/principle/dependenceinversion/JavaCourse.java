package com.itnear.principle.dependenceinversion;

/**
 * 描述：java课程
 * 作者：NearJC
 * 时间：2020/02/15
 */
public class JavaCourse implements ICourse {

    @Override
    public void studyCourse() {
        System.out.println("学生正在学习Java课程");
    }
}
