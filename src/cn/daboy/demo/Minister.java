package cn.daboy.demo;

/**
 * Created by Administrator on 2016/9/26.
 */
public class Minister {
    public static void main (String[] args) {
        for (int day = 0; day < 3; day++) {
            Emperor emperor = Emperor.getInstance();
            emperor.say();
        }
    }
}
