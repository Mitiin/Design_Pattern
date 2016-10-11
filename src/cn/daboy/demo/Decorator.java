package cn.daboy.demo;

/**
 * Created by Administrator on 2016/10/11.
 */
public abstract class Decorator extends SchoolReport {
    private SchoolReport sr;
    public Decorator(SchoolReport _sr) {
        this.sr = _sr;
    }
    public void report(){
        this.sr.report();
    }
    public void sign(String name) {
        this.sr.sign(name);
    }
}
