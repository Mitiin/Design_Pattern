package cn.daboy.demo;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/12.
 */
public class OuterUserBaseInfo implements IOuterUserBaseInfo {
    public Map getUserBaseInfo() {
        HashMap baseInfoMap = new HashMap();
        baseInfoMap.put("userName","这个员工叫混世魔王...");
        baseInfoMap.put("mobileNumber","这个员工电话是...");
        return baseInfoMap;
    }
}
