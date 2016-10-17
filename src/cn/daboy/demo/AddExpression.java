package cn.daboy.demo;

import java.util.HashMap;

/**
 * Created by Administrator on 2016/10/17.
 */
public class AddExpression extends SymbolExpression {
    public AddExpression(Expression _left, Expression _right) {
        super(_left, _right);
    }

    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) + super.right.interpreter(var);
    }
}
