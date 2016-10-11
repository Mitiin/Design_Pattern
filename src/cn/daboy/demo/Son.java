package cn.daboy.demo;

/**
 * Created by Administrator on 2016/10/11.
 */
public class Son extends Handler {
    public Son() {
        super(SON_LEVEL_REQUEST);
    }
    protected void response(IWomen women) {
        System.out.println("------母亲请示儿子------");
        System.out.println(women.getRequest());
        System.out.println("儿子的答复是:同意");
    }
}
