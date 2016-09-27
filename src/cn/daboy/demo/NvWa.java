package cn.daboy.demo;

/**
 * Created by Administrator on 2016/9/27.
 */
public class NvWa {
    public static void main(String[] args) {
        AbstractHumanFactory YinYangLu = new HumanFactory();

        System.out.println("--造出的第一批人是白色人种--");
        Human whiteHuman = YinYangLu.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();

        System.out.println("--造出的第一批人是黑色人种--");
        Human blackHuman = YinYangLu.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();

        System.out.println("--造出的第一批人是黄色人种--");
        Human YellowHuman = YinYangLu.createHuman(YellowHuman.class);
        YellowHuman.getColor();
        YellowHuman.talk();
    }
}
