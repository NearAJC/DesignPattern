package com.itnear.pattern.behavioral.iterator;

/**
 * 描述：课程集合接口
 * 作者：NearJC
 * 时间：2020/02/19
 */
public interface CourseAggregate {

    void addCourse(Course course);

    void removeCourse(Course course);

    CourseIterator getCourseIterator();
}
