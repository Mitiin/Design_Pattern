package cn.daboy.demo;

import java.util.List;

/**
 * Created by Administrator on 2016/9/24.
 */
public class GroupLeader {
    private List<Girl> listGirls;
    public GroupLeader(List<Girl> _listGirl) {
        this.listGirls = _listGirl;
    }
    public void countGirls() {
        System.out.println("女生的数量是"+this.listGirls.size());
    }
}
