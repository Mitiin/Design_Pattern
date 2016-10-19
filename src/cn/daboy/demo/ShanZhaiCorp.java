package cn.daboy.demo;

/**
 * Created by Administrator on 2016/10/18.
 */
public class ShanZhaiCorp extends Corp{
    public ShanZhaiCorp(Product product) {
        super(product);
    }

    public void makeMoney() {
        super.makeMoney();
        System.out.println("我赚钱吖...");
    }
}
