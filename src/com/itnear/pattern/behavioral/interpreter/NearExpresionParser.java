package com.itnear.pattern.behavioral.interpreter;

import java.util.Stack;

/**
 * 描述：表达式类
 * 作者：NearJC
 * 时间：2020/02/19
 */
public class NearExpresionParser {

    private Stack<Interpreter> stack = new Stack<Interpreter>();

    public int parse(String str) {
        String[] strItemArray = str.split(" ");
        for (String symbol : strItemArray) {
            if (!OperatorUtil.isOperator(symbol)) {
                Interpreter numberException = new NumberInterpreter(symbol);
                stack.push(numberException);
                System.out.println(String.format("入栈：%d", numberException.interpret()));
            } else {
                Interpreter firstExpression = stack.pop();
                Interpreter secondExpression = stack.pop();
                System.out.println(String.format("出栈：%d 和 %d", firstExpression.interpret(), secondExpression.interpret()));
                Interpreter operator = OperatorUtil.getExpressionObject(firstExpression, secondExpression, symbol);
                System.out.println(String.format("应用运算符：%s", operator));
                int result = operator.interpret();
                NumberInterpreter resultExpression = new NumberInterpreter(result);
                stack.push(resultExpression);
                System.out.println(String.format("阶段结果入栈：%d", resultExpression.interpret()));
            }
        }
        return stack.pop().interpret();
    }
}
