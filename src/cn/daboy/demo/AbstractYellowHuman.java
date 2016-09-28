package cn.daboy.demo;

/**
 * Created by Administrator on 2016/9/28.
 */
public abstract class AbstractYellowHuman implements Human {
    public void getColor() {
        System.out.println("黄色人种的皮肤颜色是黄色的!");
    }
    public void talk() {
        System.out.println("黄人种会说话.一般都是双字节.");
    }
}
