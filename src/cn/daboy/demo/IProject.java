package cn.daboy.demo;

/**
 * Created by Administrator on 2016/10/12.
 */
public interface IProject {
    public void add(String name,int num,int cost);
    public String getProjectInfo();
    public IProjectItertor iterator();
}
