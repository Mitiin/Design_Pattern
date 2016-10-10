package cn.daboy.demo;

/**
 * Created by Administrator on 2016/10/10.
 */
public class Invoker {
    private Command command;
    public void setCommand(Command command) {
        this.command = command;
    }

    public void action(){
        this.command.execute();
    }
}
