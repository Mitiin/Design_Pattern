package cn.daboy.demo;

/**
 * Created by Administrator on 2016/10/9.
 */
public class Purchase extends AbstractColleague{
    public Purchase(AbstractMediator _mediator) {
        super(_mediator);//Purchase对象
        System.out.println("生成Purchase对象:");
    }

    public void buyIBMcomputer(int number) {
        super.mediator.execute("purchase.buy",number);
    }

    public void refuseBuyIBM() {
        System.out.println("不再采购IBM电脑");
    }

}
