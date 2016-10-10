package cn.daboy.demo;

import java.util.Random;

/**
 * Created by Administrator on 2016/10/9.
 */
public class Sale extends AbstractColleague{
    public Sale(AbstractMediator _mediator) {
        super(_mediator);
    }

    public void sellIBMComputer(int number) {
        System.out.println("销售IBM电脑"+number+"台");
        super.mediator.execute("sale.sell",number);
    }

    public int getSaleStatus() {
        Random rand = new Random(System.currentTimeMillis());
        int saleStatus = rand.nextInt(100);
        System.out.println("IBM电脑的销售情况为:"+saleStatus);
        return saleStatus;
    }

    public void offSale() {
        super.mediator.execute("sale.offsell");
    }

}
