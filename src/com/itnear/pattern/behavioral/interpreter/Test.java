package com.itnear.pattern.behavioral.interpreter;

public class Test {
    public static void main(String[] args) {
        String inputStr = "6 100 11 + *";
        NearExpresionParser expresionParser = new NearExpresionParser();
        int result = expresionParser.parse(inputStr);
        System.out.println("解释器计算结果：" + result);
    }
}
