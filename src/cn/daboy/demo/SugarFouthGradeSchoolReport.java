package cn.daboy.demo;

/**
 * Created by Administrator on 2016/10/11.
 */
public class SugarFouthGradeSchoolReport extends FouthGradeSchoolReport {
    private void reportHighScore() {
        System.out.println("这次考试语文最高75,数学是78,自然是80");
    }
    private void reportSort() {
        System.out.println("我的排名是第38名");
    }
    @Override
    public void report() {
        this.reportHighScore();
        super.report();
        this.reportSort();
    }
}
