package com.itnear.pattern.structural.bridge;

/**
 * 描述：中国工商银行类
 * 作者：NearJC
 * 时间：2020/02/18
 */
public class ICBCBank extends Bank {

    public ICBCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开中国工商银行账号");
        account.openAccount();
        return account;
    }
}
