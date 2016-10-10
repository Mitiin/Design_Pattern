package cn.daboy.demo;

/**
 * Created by Administrator on 2016/10/10.
 */
public class AddRequirementCommand extends Command {
    public void execute() {
        super.rg.find();
        super.rg.add();
        super.rg.plan();
    }
}
