package cn.daboy.demo;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Administrator on 2016/9/29.
 */
public class Client {
    public static void main(String[] args) {
        IProject project = new Project();
        project.add("星球大战项目ddddd",10,100000);
        project.add("扭转时空项目",100,100000000);
        project.add("超人改造项目",10000,1000000000);
        for (int i = 0;i < 104;i++) {
            project.add("第"+i+"个项目",i*5,i*1000000);
        }
        IProjectItertor projectItertor = project.iterator();
        while (projectItertor.hasNext()) {
            IProject p = (IProject)projectItertor.next();
            System.out.println(p.getProjectInfo());
        }

    }

}