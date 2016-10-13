package cn.daboy.demo;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/10/12.
 */
public class Project implements IProject{
    private ArrayList<IProject> projectList = new ArrayList<IProject>();

    private String name = "";
    private int num = 0;
    private int cost = 0;

    public Project() {
    }
    public Project(String name,int num,int cost) {
        this.name = name;
        this.num = num;
        this.cost = cost;
    }
    public void add(String name,int num,int cost) {
        this.projectList.add(new Project(name,num,cost));
    }
    public String getProjectInfo() {
        String info = "";
        info = info+"项目名称是:"+this.name;
        info = info+"\t项目人数:"+this.num;
        info = info+"\t项目费用:"+this.cost;
        return info;
    }

    public IProjectItertor iterator() {
        return new ProjectItertor(this.projectList);
    }

}
