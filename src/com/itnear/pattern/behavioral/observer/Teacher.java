package com.itnear.pattern.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 描述：教师类 - 观察者
 * 作者：NearJC
 * 时间：2020/02/19
 */
public class Teacher implements Observer {

    private String teacherName;

    public Teacher(String teacherName) {
        this.teacherName = teacherName;
    }

    /**
     * 更新
     *
     * @param o   被观察对象
     * @param arg 参数
     */
    @Override
    public void update(Observable o, Object arg) {
        Course course = (Course) o;
        Question question = (Question) arg;
        System.out.println(teacherName + "老师的" + course.getCourseName() + "课程接收到" +
                question.getUserName() + "提交的问题：" + question.getQuestionContent());
    }
}
