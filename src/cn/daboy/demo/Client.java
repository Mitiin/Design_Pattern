package cn.daboy.demo;


/**
 * Created by Administrator on 2016/9/29.
 */
public class Client {
    public static void main(String[] args) {
        Observer liSi = new LiSi();
        Observer wangSi = new WangSi();
        HanFeiZi hanFeiZi = new HanFeiZi();

        hanFeiZi.addObserver(liSi);
        hanFeiZi.addObserver(wangSi);

        hanFeiZi.haveBreakfast();
        hanFeiZi.haveFun();
    }


}