package com.itnear.principle.singlersponsibility.method;

/**
 * 描述：方法类
 * 作者：NearJC
 * 时间：2020/02/16
 */
public class Method {

    /**
     * 不遵守单一职责的情况
     */
    private void updateUserInfo(String userName, String address) {
        userName = "near";
        address = "深圳";
    }

    private void updateUserName(String userName){
        userName = "near";
    }

    private void updateUserAddress(String address){
        address = "深圳";
    }
}
