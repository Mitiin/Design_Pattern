package cn.daboy.demo;

/**
 * Created by Administrator on 2016/10/17.
 */
public abstract class SymbolExpression extends Expression{
    protected Expression left;
    protected Expression right;

    public SymbolExpression(Expression _left,Expression _right) {
        this.left = _left;
        this.right = _right;
    }
}
