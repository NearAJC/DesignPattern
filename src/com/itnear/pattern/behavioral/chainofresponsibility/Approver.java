package com.itnear.pattern.behavioral.chainofresponsibility;

/**
 * 描述：批准者抽象类
 * 作者：NearJC
 * 时间：2020/02/19
 */
public abstract class Approver {

    protected Approver approver;

    public void setNextApprover(Approver approver) {
        this.approver = approver;
    }

    public abstract void deploy(Course course);
}
