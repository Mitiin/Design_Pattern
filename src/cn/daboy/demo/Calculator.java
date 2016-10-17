package cn.daboy.demo;

import org.omg.CORBA.OBJ_ADAPTER;

import java.util.HashMap;
import java.util.Stack;

/**
 * Created by Administrator on 2016/10/17.
 */
public class Calculator {
    private Expression expression;
                      //     a+b-c
    public Calculator(String expStr) {

        Stack<Expression> stack = new Stack<Expression>();
        char[] charArray = expStr.toCharArray();

        Expression left = null;
        Expression right = null;

        //charArray.length = 5
        for (int i = 0;i < charArray.length;i++) {
            switch (charArray[i]){
                case '+':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new AddExpression(left,right));
                    break;
                case '-':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new SubExpression(left,right));
                    break;
                default:
                    // a
                    stack.push(new VarExpression(String.valueOf(charArray[i])));
            }

        }

        this.expression = stack.pop();
    }


                  //            {b=2, c=1, a=5}
    public int run(HashMap<String,Integer> var) {
        return this.expression.interpreter(var);
    }
}
