package cn.daboy.demo;

/**
 * Created by Administrator on 2016/9/23.
 */
public class Main {
    public static void main(String[] args) {
        Driver zhangSan = new Driver();
        Benz benz = new Benz();
        BMW bmw = new BMW();

        zhangSan.driver(benz);
    }
}

