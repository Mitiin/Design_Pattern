package cn.daboy.demo;


import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Administrator on 2016/9/29.
 */
public class Client {
    public static void main(String[] args) {
        /*
        IUserInfo youngGirl = new UserInfo();
        for (int i = 0;i < 101;i++) {
            youngGirl.getMobileNumber();
        }
        */
        IUserInfo youngGirl = new OuterUserInfo();
        for (int i = 0;i < 101; i++){
            youngGirl.getMobileNumber();
        }
    }

}