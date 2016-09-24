package cn.daboy.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/9/23.
 */
public class Main {
    public static void main(String[] args) {
        List<Girl> listGirl = new ArrayList<Girl>();
        for (int i = 0;i<20; i++) {
            listGirl.add(new Girl());
        }
        Teacher teacher = new Teacher();
        teacher.commond(new GroupLeader(listGirl));
    }
}

