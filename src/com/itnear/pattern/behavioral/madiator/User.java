package com.itnear.pattern.behavioral.madiator;

/**
 * 描述：用户类
 * 作者：NearJC
 * 时间：2020/02/19
 */
public class User {

    private String userName;

    public User(String userName) {
        this.userName = userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void sendMessage(String message) {
        StudyGroup.showMessage(this, message);
    }
}
