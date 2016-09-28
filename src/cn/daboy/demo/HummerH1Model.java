package cn.daboy.demo;

/**
 * Created by Administrator on 2016/9/28.
 */
public class HummerH1Model extends HummerModel {
    private boolean alarmFlag = true;


    public void start() {
        System.out.println("悍马H1发动...");
    }

    public void stop() {
        System.out.println("悍马H1停车...");
    }

    public void alarm() {
        System.out.println("悍马H1鸣笛...");
    }

    public void engineBoom() {
        System.out.println("悍马H1引擎声音是这样的...");
    }



    public void setAlarm(boolean isAlarm) {
        this.alarmFlag = isAlarm;
    }


    public boolean isAlarm() {
        return this.alarmFlag;
    }
}
