package cn.daboy.demo;

/**
 * Created by Administrator on 2016/10/13.
 */
public class HanFeiZi implements IHanFeiZi {
    ILiSi liSi = new LiSi();

    public void haveBreakfast() {
        System.out.println("韩非子:开始吃饭了...");
        this.liSi.update("韩非子在吃饭");
    }

    public void haveFun() {
        System.out.println("韩非子:开始娱乐了...");
        this.liSi.update("韩非子在娱乐");
    }

}
