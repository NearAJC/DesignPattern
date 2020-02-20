package com.itnear.pattern.behavioral.observer;

/**
 * 描述：问题类
 * 作者：NearJC
 * 时间：2020/02/19
 */
public class Question {

    private String userName;

    private String questionContent;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getQuestionContent() {
        return questionContent;
    }

    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent;
    }
}
