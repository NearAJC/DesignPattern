package com.itnear.pattern.behavioral.madiator;

import java.util.Date;

/**
 * 描述：学习群类 - 中介者
 * 作者：NearJC
 * 时间：2020/02/19
 */
public class StudyGroup {

    public static void showMessage(User user, String message) {
        System.out.println(new Date() + "[" + user.getUserName() + "] : " + message);
    }
}
