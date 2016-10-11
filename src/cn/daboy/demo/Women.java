package cn.daboy.demo;

/**
 * Created by Administrator on 2016/10/11.
 */
public class Women implements IWomen {
    private int type = 0;
    private String request = "";

    public Women(int _type,String _request) {
        this.type = _type;
        switch (this.type) {
            case 1:
                this.request = "女儿的请求是:"+_request;
                break;
            case 2:
                this.request = "妻子的请求是:"+_request;
                break;
            case 3:
                this.request = "母亲的请求是:"+_request;
        }
        //this.request = _request;
    }
    public int getType() {
        return this.type;
    }

    public String getRequest() {
        return this.request;
    }
}
