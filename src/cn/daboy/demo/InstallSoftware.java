package cn.daboy.demo;

/**
 * Created by Administrator on 2016/9/24.
 */
public class InstallSoftware {
    public void installWizard(Wizard wizard) {
        int first = wizard.first();
        if (first > 50) {
            int second = wizard.second();
            if (second > 50) {
                int third = wizard.third();

                if (third > 50) {
                    wizard.first();
                }
            }
        }
    }
}
