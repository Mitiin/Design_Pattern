package cn.daboy.demo;

/**
 * Created by Administrator on 2016/9/26.
 */
public class Emperor {
    private static final Emperor emperor = new Emperor();
    private Emperor() {

    }
    public static Emperor getInstance() {
        return emperor;
    }
    public static void say() {
        System.out.println("我就是皇帝某某某...");
    }
}
