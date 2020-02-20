package com.itnear.pattern.behavioral.observer;

public class Test {
    public static void main(String[] args) {
        Course course = new Course("Java设计模式");
        Teacher teacher = new Teacher("Alpha");
        course.addObserver(teacher);

        // 业务逻辑代码
        Question question = new Question();
        question.setUserName("Near");
        question.setQuestionContent("源码不存在，请提供");
        course.productQuestion(course,question);
    }
}
