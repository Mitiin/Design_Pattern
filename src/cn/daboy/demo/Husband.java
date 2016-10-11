package cn.daboy.demo;

/**
 * Created by Administrator on 2016/10/11.
 */
public class Husband extends Handler {
    public Husband() {
        super(HUSBAND_LEVEL_REQUEST);
    }

    protected void response(IWomen women) {
        System.out.println("\n------妻子向父亲请示------");
        System.out.println(women.getRequest());
        System.out.println("丈夫的答复是:同意");
    }
}
