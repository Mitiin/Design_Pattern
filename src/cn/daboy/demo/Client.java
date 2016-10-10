package cn.daboy.demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Random;

/**
 * Created by Administrator on 2016/9/29.
 */
public class Client {
    public static void main(String[] args) {
        Invoker xiaoSan = new Invoker();
        System.out.println("------客户要求增加一项需求------");
        Command command = new AddRequirementCommand();
        xiaoSan.setCommand(command);
        xiaoSan.action();

        System.out.println("------客户要求删除一个页面------");
        command = new DeletePageCommand();
        xiaoSan.setCommand(command);
        xiaoSan.action();
    }
}
