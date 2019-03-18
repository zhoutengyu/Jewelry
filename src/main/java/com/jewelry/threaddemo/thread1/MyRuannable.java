package com.jewelry.threaddemo.thread1;

/**
 * Created by admin on 2019/3/18.
 */
public class MyRuannable implements Runnable {
    @Override
    public void run() {
        System.out.println("测试MyRuannable启动线程");
    }
}
