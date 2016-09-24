package cn.daboy.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/9/24.
 */
public class Teacher {
    public void commond(GroupLeader groupLeader) {
        List listGirls = new ArrayList();
        for (int i = 0; i<20; i++) {
            listGirls.add(new Girl());
        }
        groupLeader.countGirls(listGirls);
    }
}
