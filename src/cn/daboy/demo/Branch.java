package cn.daboy.demo;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/10/13.
 */
public class Branch extends Corp {

    private ArrayList<Corp> subordinateList = new ArrayList<Corp>();


    public Branch(String _name,String _position,int _salary) {
        super(_name,_position,_salary);
    }

    public void addSubordinate(Corp corp) {
        this.subordinateList.add(corp);
    }

    public ArrayList<Corp> getSubordinate() {
        return this.subordinateList;
    }

}
