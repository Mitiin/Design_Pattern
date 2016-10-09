package cn.daboy.demo;

import java.util.Random;

/**
 * Created by Administrator on 2016/10/9.
 */
public class Sale {
    public void sellIBMComputer(int number) {
        Stock stock = new Stock();
        Purchase purchase = new Purchase();
        if (stock.getStockNumber() < number) {
            purchase.buyIBMcomputer(number);
        }
        System.out.println("销售IBM电脑"+number+"台");
        stock.decrease(number);
    }

    public int getSaleStatus() {
        Random rand = new Random(System.currentTimeMillis());
        int saleStatus = rand.nextInt(100);
        System.out.println("IBM电脑的销售情况为:"+saleStatus);
        return saleStatus;
    }

    public void offSale() {
        Stock stock = new Stock();
        System.out.println("折价销售IBM电脑"+stock.getStockNumber()+"台");
    }

}
