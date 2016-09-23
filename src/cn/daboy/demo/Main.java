package cn.daboy.demo;

/**
 * Created by Administrator on 2016/9/23.
 */
public class Main {
    public static void main(String[] args) {
        IDriver zhangSan = new Driver();
        ICar benz = new Benz();
        ICar bmw = new BMW();

        zhangSan.driver(benz);
    }
}

