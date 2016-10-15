package cn.daboy.demo;

/**
 * Created by Administrator on 2016/10/15.
 */
public class ShowVisitor implements IShowVisitor {
    private String info = "";
    public void visit(CommonEmployee commonEmployee) {
        this.info = this.info+this.getBasicInfo(commonEmployee)+"工作:"+commonEmployee.getJob()+"\t\n";
    }

    public void visit(Manager manager) {
        this.info = this.info+this.getBasicInfo(manager)+"业绩:"+manager.getPerformance()+"\t\n";
    }

    public int getTotalSalary() {
        return 0;
    }

    public void report() {
        System.out.println(this.info);
    }

    private String getBasicInfo(Employee employee) {
        String info = "姓名:"+employee.getName()+"\t";
        info = info+"性别:"+(employee.getSex() == Employee.FEMALE?"女":"男")+"\t";
        info = info+"薪水:"+employee.getSalary()+"\t";
        return info;
    }
}
