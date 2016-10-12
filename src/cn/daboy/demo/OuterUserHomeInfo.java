package cn.daboy.demo;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/12.
 */
public class OuterUserHomeInfo implements IOuterUserHomeInfo {
    public Map getUserHomeInfo() {
        HashMap homeInfo = new HashMap();
        homeInfo.put("homeTelNumber","员工的家庭电话是...");
        homeInfo.put("homeAddress","员工的家庭地址是");
        return homeInfo;
    }
}
