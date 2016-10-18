package cn.daboy.demo;

/**
 * Created by Administrator on 2016/10/17.
 */
public class SignInfo4Pool extends SignInfo {
    private String key;
    public SignInfo4Pool(String _key) {
        this.key = _key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
