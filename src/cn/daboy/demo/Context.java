package cn.daboy.demo;

/**
 * Created by Administrator on 2016/10/12.
 */
public class Context {
    private IStrategy strategy;
    public Context(IStrategy _strategy) {
        this.strategy = _strategy;
    }
    public void operate() {
        this.strategy.operate();
    }
}

