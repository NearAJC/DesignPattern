package com.itnear.pattern.structural.bridge;

/**
 * 描述：活期帐户类
 * 作者：NearJC
 * 时间：2020/02/18
 */
public class SavingAccount implements Account {

    @Override
    public Account openAccount() {
        System.out.println("打开活期账号");
        return new SavingAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个活期账号");
    }
}
