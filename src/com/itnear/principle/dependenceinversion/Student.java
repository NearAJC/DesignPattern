package com.itnear.principle.dependenceinversion;

/**
 * 描述：学生类
 * 作者：NearJC
 * 时间：2020/02/15
 */
public class Student {

    /**
     * 课程
     */
    private ICourse iCourse;

    /**
     * 设置课程对象
     *
     * @param iCourse 课程对象
     */
    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    /**
     * 学生线上课程
     */
    public void studyImoocCourse() {
        this.iCourse.studyCourse();
    }
}
