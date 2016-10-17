package cn.daboy.demo;

/**
 * Created by Administrator on 2016/10/15.
 */
public class StoppingState extends LiftState {
    @Override
    public void open() {
        super.context.setLiftState(Context.openingState);
        super.context.getLiftState().open();
    }

    @Override
    public void close() {
        //
    }

    @Override
    public void run() {
        super.context.setLiftState(context.runningState);
        super.context.getLiftState().run();
    }

    @Override
    public void stop() {
        System.out.println("电梯停止了...");
    }
}
