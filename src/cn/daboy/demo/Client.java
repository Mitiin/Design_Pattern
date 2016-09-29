package cn.daboy.demo;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/9/29.
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        for (int i = 0; i < 1000000; i++) {
            director.getABenzModel().run();
        }
        for (int i = 0; i < 1000000;i++) {
            director.getBBenzModel().run();
        }
        for (int i = 0; i < 1000000;i++) {
            director.getCBMWModel().run();
        }
    }
}
