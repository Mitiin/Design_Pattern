package cn.daboy.demo;

/**
 * Created by Administrator on 2016/10/15.
 */
public interface IVisitor {
    public void visit(CommonEmployee commonEmployee);
    public void visit(Manager manager);
    //public int getTotalSalary();
}
