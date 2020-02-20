package com.itnear.pattern.behavioral.iterator;

/**
 * 描述：迭代器接口
 * 作者：NearJC
 * 时间：2020/02/19
 */
public interface CourseIterator {

    Course nextCourse();

    boolean isLastCourse();
}
