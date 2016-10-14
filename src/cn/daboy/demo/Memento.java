package cn.daboy.demo;

/**
 * Created by Administrator on 2016/10/14.
 */
public class Memento {
    private String state = "";
    public Memento(String _state) {
        this.state = _state;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state= state;
    }
}
