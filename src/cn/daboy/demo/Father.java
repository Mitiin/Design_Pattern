package cn.daboy.demo;

/**
 * Created by Administrator on 2016/10/11.
 */
public class Father extends Handler{
    public Father() {
        super(Handler.FATHER_LEVEL_REQUEST);
    }

    protected void response(IWomen women) {
        System.out.println("\n------女儿向父亲请示------");
        System.out.println(women.getRequest());
        System.out.println("父亲的答复是:同意");
    }
}
