package cn.daboy.demo;

/**
 * Created by Administrator on 2016/10/10.
 */
public class DeletePageCommand extends Command {
    public void execute() {
        super.pg.find();
        super.pg.delete();
        super.pg.plan();
    }
}
