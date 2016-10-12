package cn.daboy.demo;

import java.util.Map;

/**
 * Created by Administrator on 2016/10/12.
 */
public class OuterUserInfo implements IUserInfo {
    private IOuterUserBaseInfo baseInfo = null;
    private IOuterUserHomeInfo homeInfo = null;
    private IOuterUserOfficeInfo officeInfo = null;

    private Map baseMap = null;
    private Map homeMap = null;
    private Map officeMap = null;

    public OuterUserInfo(IOuterUserBaseInfo _baseInfo,IOuterUserHomeInfo _homeInfo,IOuterUserOfficeInfo _officeInfo) {
        this.baseInfo = _baseInfo;
        this.homeInfo = _homeInfo;
        this.officeInfo = _officeInfo;

        this.baseMap = this.baseInfo.getUserBaseInfo();
        this.homeMap = this.homeInfo.getUserHomeInfo();
        this.officeMap = this.officeInfo.getUserOfficeInfo();
    }



    public String getUserName() {
        String userName = (String)this.baseMap.get("userName");
        System.out.println(userName);
        return userName;
    }

    public String getHomeAddress() {
        String homeAddress = (String)this.homeMap.get("honeAddress");
        System.out.println(homeAddress);
        return homeAddress;
    }

    public String getMobileNumber() {
        String mobileNumber = (String)this.baseMap.get("mobileNumber");
        System.out.println(mobileNumber);
        return mobileNumber;
    }

    public String getOfficeTelNumber() {
        String officeTelNumber = (String)this.officeMap.get("officeTelNumber");
        System.out.println(officeTelNumber);
        return officeTelNumber;
    }

    public String getJobPosition() {
        String jobPosition = (String)this.officeMap.get("jobPosition");
        System.out.println(jobPosition);
        return jobPosition;
    }

    public String getHomeTelNumber() {
        String homeTelNumber = (String)this.homeMap.get("homeTelNumber");
        System.out.println(homeTelNumber);
        return homeTelNumber;
    }

}
