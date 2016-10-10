package cn.daboy.demo;

/**
 * Created by Administrator on 2016/10/10.
 */
public class RequirementGroup extends Group {
    public void find() {
        System.out.println("找到需求组...");
    }

    public void add() {
        System.out.println("客户要求增加一项需求...");
    }

    public void delete() {
        System.out.println("客户要求删除一项需求...");
    }

    public void change() {
        System.out.println("客户要求修改一项需求...");
    }

    public void plan() {
        System.out.println("客户要求需求变更计划...");
    }
}
