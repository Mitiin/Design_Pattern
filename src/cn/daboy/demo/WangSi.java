package cn.daboy.demo;

/**
 * Created by Administrator on 2016/10/13.
 */
public class WangSi implements Observer {
    public void update(String context) {
        System.out.println("王斯:观察到韩非子活动");
        System.out.println("王斯:没理他.");
    }
}
