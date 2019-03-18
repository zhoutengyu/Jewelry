package com.jewelry.threaddemo.thread1;

/**
 * Created by admin on 2019/3/18.
 */
public class MyThread extends Thread {
    private int i;

    public MyThread(int i) {
        super();
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println(i);
    }
}
