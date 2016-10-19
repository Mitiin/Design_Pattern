package cn.daboy.demo;

/**
 * Created by Administrator on 2016/10/18.
 */
public abstract class Corp {
    private Product product;
    public Corp(Product product) {
        this.product = product;
    }
    public void makeMoney() {
        this.product.beProducted();
        this.product.beSelled();
    }
}
