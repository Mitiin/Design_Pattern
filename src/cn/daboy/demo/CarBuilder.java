package cn.daboy.demo;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/9/29.
 */
public abstract class CarBuilder {
    public abstract void setSequence(ArrayList<String> sequence);
    public abstract CarModel getCarModel();
}
