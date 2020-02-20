package com.itnear.pattern.structural.bridge;

/**
 * 描述：定期帐户类
 * 作者：NearJC
 * 时间：2020/02/18
 */
public class DepositAccount implements Account {
    @Override
    public Account openAccount() {
        System.out.println("打开定期账号");
        return new DepositAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个定期账号");
    }
}
