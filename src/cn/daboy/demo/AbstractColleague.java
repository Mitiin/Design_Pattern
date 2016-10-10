package cn.daboy.demo;

/**
 * Created by Administrator on 2016/10/9.
 */
//抽象同事类
public abstract class AbstractColleague {
    protected AbstractMediator mediator;
    public AbstractColleague(AbstractMediator _mediator) {
        this.mediator = _mediator;
    }
}
