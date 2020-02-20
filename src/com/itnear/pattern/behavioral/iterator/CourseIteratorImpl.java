package com.itnear.pattern.behavioral.iterator;

import java.util.List;

/**
 * 描述：迭代器实现类
 * 作者：NearJC
 * 时间：2020/02/19
 */
public class CourseIteratorImpl implements CourseIterator {

    private List<Course> courseList;

    int position;

    Course course;

    public CourseIteratorImpl(List<Course> courseList) {
        this.courseList = courseList;
    }

    @Override
    public Course nextCourse() {
        System.out.println("返回课程，位置" + position);
        course = courseList.get(position);
        position++;
        return course;
    }

    @Override
    public boolean isLastCourse() {
        if (position < courseList.size()) {
            return false;
        }
        return true;
    }
}
