package cn.daboy.demo;

import java.util.HashMap;

/**
 * Created by Administrator on 2016/10/17.
 */
public class VarExpression extends Expression {
    private String key;
    public VarExpression(String _key) {
        this.key = _key;
    }
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(this.key);
    }
}
