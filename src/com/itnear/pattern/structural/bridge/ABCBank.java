package com.itnear.pattern.structural.bridge;

/**
 * 描述：中国农业银行类
 * 作者：NearJC
 * 时间：2020/02/18
 */
public class ABCBank extends Bank {

    public ABCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开中国农业银行账号");
        account.openAccount();
        return account;
    }
}
