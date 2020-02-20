package com.itnear.pattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述：课程集合实现类
 * 作者：NearJC
 * 时间：2020/02/19
 */
public class CourseAggregateImpl implements CourseAggregate {

    private List<Course> courseList;

    public CourseAggregateImpl() {
        this.courseList = new ArrayList<Course>();
    }

    @Override
    public void addCourse(Course course) {
        courseList.add(course);
    }

    @Override
    public void removeCourse(Course course) {
        courseList.remove(course);
    }

    @Override
    public CourseIterator getCourseIterator() {
        return new CourseIteratorImpl(courseList);
    }
}
