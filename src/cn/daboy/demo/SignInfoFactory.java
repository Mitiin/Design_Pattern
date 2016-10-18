package cn.daboy.demo;

import java.util.HashMap;

/**
 * Created by Administrator on 2016/10/17.
 */
public class SignInfoFactory {
    private static HashMap<String,SignInfo> pool = new HashMap<String, SignInfo>();

    @Deprecated
    public static SignInfo getSignInfo() {
        return new SignInfo();
    }

    public static SignInfo getSignInfo(String key) {
        SignInfo result = null;
        if (!pool.containsKey(key)) {
            System.out.println(key+"----建立对象,并放置到池中");
            result = new SignInfo4Pool(key);
            pool.put(key,result);
        } else  {
            result = pool.get(key);
            System.out.println("---直接从池中取得");
        }
        return result;
    }



}
