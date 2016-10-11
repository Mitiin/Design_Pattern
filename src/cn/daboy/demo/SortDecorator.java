package cn.daboy.demo;

/**
 * Created by Administrator on 2016/10/11.
 */
public class SortDecorator extends Decorator {
    public SortDecorator(SchoolReport _sr) {
        super(_sr);
    }
    private void reportSort() {
        System.out.println("我是排名第38名...");
    }
    @Override
    public void report() {
        super.report();
        this.reportSort();
    }
}
