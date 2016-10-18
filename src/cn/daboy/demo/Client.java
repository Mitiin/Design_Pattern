package cn.daboy.demo;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * Created by Administrator on 2016/9/29.
 */

public class Client {
    public static void main(String[] args) throws IOException{
        for (int i = 0;i < 4;i++) {
            String subject = "科目"+i;
            for (int j = 0;j < 30;j++) {
                String key = subject+"考试地点"+j;
                SignInfoFactory.getSignInfo(key);
            }
        }
        SignInfo signInfo = SignInfoFactory.getSignInfo("科目1考试地点1");
    }
}
