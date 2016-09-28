package cn.daboy.demo;

/**
 * Created by Administrator on 2016/9/28.
 */
public abstract class HummerModel {

    public abstract void start();
    public abstract void stop();
    public abstract void alarm();
    public abstract void engineBoom();
    public void run() {
        this.start();
        this.engineBoom();
        if (this.isAlarm()) {
            this.alarm();
        }
        this.stop();
    }
    //钩子方法
    protected boolean isAlarm() {
        return true;
    }
}
