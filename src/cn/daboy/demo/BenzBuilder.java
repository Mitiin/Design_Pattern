package cn.daboy.demo;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/9/29.
 */
public class BenzBuilder extends CarBuilder {
    private BenzModel benz = new BenzModel();
    public void setSequence(ArrayList<String> sequence) {
        this.benz.setSequence(sequence);
    }

    public CarModel getCarModel() {
        return this.benz;
    }
}
