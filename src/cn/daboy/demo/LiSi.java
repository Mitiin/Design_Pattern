package cn.daboy.demo;

/**
 * Created by Administrator on 2016/10/13.
 */
public class LiSi implements ILiSi {
    public void update(String str) {
        System.out.println("李斯:观察到韩非子活动,开始向老板汇报了...");
        this.reportToQinShiHuang(str);
        System.out.println("李斯:汇报完毕...\n");
    }
    public void reportToQinShiHuang(String reportContext) {
        System.out.println("李斯:报告,秦老板!韩非子有活动了--->"+reportContext);
    }
}
