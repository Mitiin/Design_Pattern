package cn.daboy.demo;


import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Administrator on 2016/9/29.
 */
public class Client {
    public static void main(String[] args) {
        IOuterUserBaseInfo baseInfo = new OuterUserBaseInfo();
        IOuterUserHomeInfo homeInfo = new OuterUserHomeInfo();
        IOuterUserOfficeInfo officeInfo = new OuterUserOfficeInfo();

        IUserInfo youngGirl = new OuterUserInfo(baseInfo,homeInfo,officeInfo);
        for (int i = 0;i < 101;i++) {
            youngGirl.getMobileNumber();
        }
    }

}