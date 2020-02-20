package com.itnear.pattern.behavioral.interpreter;

/**
 * 描述：数字解释器类
 * 作者：NearJC
 * 时间：2020/02/19
 */
public class NumberInterpreter implements Interpreter {

    private int number;

    public NumberInterpreter(int number) {
        this.number = number;
    }

    public NumberInterpreter(String number) {
        this.number = Integer.parseInt(number);
    }

    @Override
    public int interpret() {
        return this.number;
    }
}
