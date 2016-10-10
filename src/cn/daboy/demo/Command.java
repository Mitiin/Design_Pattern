package cn.daboy.demo;

/**
 * Created by Administrator on 2016/10/10.
 */
public abstract class Command {
    protected RequirementGroup rg = new RequirementGroup();
    protected PageGroup pg = new PageGroup();
    protected CodeGroup cg = new CodeGroup();

    public abstract void execute();
}
