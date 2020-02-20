package com.itnear.pattern.behavioral.observer;

import java.util.Observable;

/**
 * 描述：课程类 - 被观察者
 * 作者：NearJC
 * 时间：2020/02/19
 */
public class Course extends Observable {

    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void productQuestion(Course course, Question question) {
        System.out.println(question.getUserName() + "在" + course.getCourseName() + "提交了一个问题");
        setChanged();
        notifyObservers(question);
    }
}
