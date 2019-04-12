package com.jewelry.study.DesignPattern.singleton.s1;

/**
 * Created by admin on 2019/3/29.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println(MyObject.getInstance().hashCode());
    }
}
