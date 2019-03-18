package com.jewelry.threaddemo.thread0;

/**
 * Created by admin on 2019/3/18.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("我的线程开始了。。。。");
    }
}
