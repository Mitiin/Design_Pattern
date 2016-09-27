package cn.daboy.demo;

/**
 * Created by Administrator on 2016/9/27.
 */
public abstract class AbstractHumanFactory {
    public abstract <T extends Human>T createHuman(Class<T> c);
}
