package cn.daboy.demo;

import java.util.Random;

/**
 * Created by Administrator on 2016/9/24.
 */
public class Wizard {
    private Random rand = new Random(System.currentTimeMillis());
    public int first() {
        System.out.println("执行第一个方法...");
        return rand.nextInt(100);
    }
    public int second() {
        System.out.println("执行第二个方法...");
        return rand.nextInt(100);
    }
    public int third() {
        System.out.println("执行第三个方法...");
        return rand.nextInt(100);
    }
}
