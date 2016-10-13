package cn.daboy.demo;

/**
 * Created by Administrator on 2016/10/13.
 */
public abstract class Corp {
    public String name = "";
    private String position = "";
    private int salary = 0;

    public Corp(String _name,String _position,int _salary) {
        this.name = _name;
        this.position = _position;
        this.salary = _salary;
    }

    public String getInfo() {
        String info = "";
        info = "名称:"+this.name;
        info = info+"\t 职位 : "+this.position;
        info = info+"\t 薪水 : "+this.salary;
        return info;
    }

}
