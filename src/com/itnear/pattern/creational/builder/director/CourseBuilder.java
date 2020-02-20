package com.itnear.pattern.creational.builder.director;

/**
 * 描述：课程建造者抽象类
 * 作者：NearJC
 * 时间：2020/02/16
 */
public abstract class CourseBuilder {

    public abstract void buildCourseName(String courseName);

    public abstract void buildCoursePPT(String coursePPT);

    public abstract void buildCourseVideo(String courseVideo);

    public abstract void buildCourseArticle(String courseArticle);

    public abstract void buildCourseQA(String courseQA);

    public abstract Course makeCourse();
}
