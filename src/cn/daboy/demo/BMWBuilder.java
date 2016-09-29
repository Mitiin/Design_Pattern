package cn.daboy.demo;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/9/29.
 */
public class BMWBuilder extends CarBuilder {
    private BMWModel bmw = new BMWModel();
    public void setSequence(ArrayList<String> sequence) {
        this.bmw.setSequence(sequence);
    }

    public CarModel getCarModel() {
        return this.bmw;
    }
}
