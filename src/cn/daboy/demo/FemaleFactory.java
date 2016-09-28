package cn.daboy.demo;

/**
 * Created by Administrator on 2016/9/28.
 */
public class FemaleFactory implements HumanFactory {
    public Human createYellowHuman() {
        return new FemleYellowHuman();
    }

    public Human createWhiteHuman() {
        return new FemleWhiteHuman();
    }

    public Human createBlackHuman() {
        return new FemleBlackHuman();
    }
}
