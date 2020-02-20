package com.itnear.pattern.structural.adapter.objectadapter;

/**
 * 描述：220V交流电压 - 被适配者类
 * 作者：NearJC
 * 时间：2020/02/18
 */
public class AC220 {

    public int outputAC220V() {
        int output = 220;
        System.out.println("输出交流电" + output + "V");
        return output;
    }
}
