package cn.daboy.demo;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/10/12.
 */
public class ProjectItertor implements IProjectItertor{
    private ArrayList<IProject> projectList ;// = new ArrayList<IProject>();
    private int currentItem = 0;

    public ProjectItertor(ArrayList<IProject> projectList) {
        this.projectList = projectList;
    }

    public boolean hasNext() {
        boolean b = true;
        if (this.currentItem >= projectList.size() || this.projectList.get(this.currentItem) == null) {
            b = false;
        }
        return b;
    }

    public IProject next() {
        return (IProject)this.projectList.get(this.currentItem++);
    }

    public void remove() {

    }
}
