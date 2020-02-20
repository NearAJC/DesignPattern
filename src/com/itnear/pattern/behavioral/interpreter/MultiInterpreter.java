package com.itnear.pattern.behavioral.interpreter;

/**
 * 描述：乘法解释器类
 * 作者：NearJC
 * 时间：2020/02/19
 */
public class MultiInterpreter implements Interpreter {

    private Interpreter firstExpression, secondExpresion;

    public MultiInterpreter(Interpreter firstExpression, Interpreter secondExpresion) {
        this.firstExpression = firstExpression;
        this.secondExpresion = secondExpresion;
    }

    @Override
    public int interpret() {
        return this.firstExpression.interpret() * this.secondExpresion.interpret();
    }

    @Override
    public String toString() {
        return "*";
    }
}
