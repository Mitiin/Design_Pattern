package cn.daboy.demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Random;

/**
 * Created by Administrator on 2016/9/29.
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("------采购人员采购电脑------");
        Purchase purchase = new Purchase();
        purchase.buyIBMcomputer(100);

        System.out.println("\n------销售人员销售电脑------");
        Sale sale = new Sale();
        sale.sellIBMComputer(1);

        System.out.println("\n------库房管理人员清库处理------");
        Stock stock = new Stock();
        stock.clearStock();
    }
}
