package cn.daboy.demo;

/**
 * Created by Administrator on 2016/9/28.
 */
public class MaleFactory implements HumanFactory {
    public Human createYellowHuman() {
        return new MaleYellowHuman();
    }

    public Human createWhiteHuman() {
        return new MaleWhiteHuman();
    }

    public Human createBlackHuman() {
        return new MaleBlackHuman();
    }
}
