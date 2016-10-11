package cn.daboy.demo;

/**
 * Created by Administrator on 2016/10/11.
 */
public class HighScoreDecorator extends Decorator {
    public HighScoreDecorator(SchoolReport _sr) {
        super(_sr);
    }

    private void reportHighScore() {
        System.out.println("这次考试语文最高是75分,数学是78,自然是80");
    }
    @Override
    public void report() {
        this.reportHighScore();
        super.report();
    }
}
