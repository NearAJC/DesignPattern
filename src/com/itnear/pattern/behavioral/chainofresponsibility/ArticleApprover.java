package com.itnear.pattern.behavioral.chainofresponsibility;

/**
 * 描述：手记批准者类
 * 作者：NearJC
 * 时间：2020/02/19
 */
public class ArticleApprover extends Approver {

    @Override
    public void deploy(Course course) {
        if (course.getArticle() != null && !"".equals(course.getArticle())) {
            System.out.println("含有手记，批准");
            if (approver != null) {
                approver.deploy(course);
            }
        } else {
            System.out.println("不包含手记，不批准,流程结束");
            return;
        }
    }
}
