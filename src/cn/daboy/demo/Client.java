package cn.daboy.demo;


import com.sun.org.apache.bcel.internal.generic.ISHL;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/9/29.
 */
public class Client {
    public static void main(String[] args) {
        AbsActor actor = new OldActor();
        Role role = new KungFuRole();

        role.accept(actor);
        //actor.act(role);
        //actor.act( new KungFuRole());


    }

}