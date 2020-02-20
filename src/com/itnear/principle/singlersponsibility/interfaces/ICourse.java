package com.itnear.principle.singlersponsibility.interfaces;

/**
 * 描述：课程接口 - 不遵守单一职责
 * 作者：NearJC
 * 时间：2020/02/16
 */
public interface ICourse {

    String getCourseName();

    byte[] getCourseVideo();

    void studyCourse();

    void refundCourse();
}
