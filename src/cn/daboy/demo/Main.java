package cn.daboy.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/9/23.
 */
public class Main {
    public static void main(String[] args) {
        InstallSoftware invoker = new InstallSoftware();
        invoker.installWizard(new Wizard());
    }
}

