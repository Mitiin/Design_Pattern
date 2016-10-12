package cn.daboy.demo;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/12.
 */
public class OuterUserOfficeInfo implements IOuterUserOfficeInfo{
    public Map getUserOfficeInfo() {
        HashMap officeInfo = new HashMap();
        officeInfo.put("jobPosition","这个人的职位是BOSS");
        officeInfo.put("officeTelNumber","员工的办公电话是...");
        return officeInfo;
    }
}
