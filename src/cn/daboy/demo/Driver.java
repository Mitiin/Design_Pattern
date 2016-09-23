package cn.daboy.demo;

public class Driver implements IDriver {
    public void driver(ICar car) {
        car.run();
    }
}
