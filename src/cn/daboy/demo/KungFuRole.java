package cn.daboy.demo;

/**
 * Created by Administrator on 2016/10/15.
 */
public class KungFuRole implements Role {
    public void accept(AbsActor actor) {
        actor.act(this);
    }
}
