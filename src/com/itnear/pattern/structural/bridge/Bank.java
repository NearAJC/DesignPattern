package com.itnear.pattern.structural.bridge;

/**
 * 描述：银行抽象类
 * 作者：NearJC
 * 时间：2020/02/18
 */
public abstract class Bank {
    protected Account account;

    public Bank(Account account){
        this.account = account;
    }

    abstract Account openAccount();
}
