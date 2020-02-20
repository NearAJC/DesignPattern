package com.itnear.principle.dependenceinversion;

/**
 * 描述：前端课程
 * 作者：NearJC
 * 时间：2020/02/15
 */
public class FECourse implements ICourse {

    @Override
    public void studyCourse() {
        System.out.println("学生正在学习前端课程");
    }
}
