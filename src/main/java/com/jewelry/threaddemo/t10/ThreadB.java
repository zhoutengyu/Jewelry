package com.jewelry.threaddemo.t10;

/**
 * Created by admin on 2019/3/22.
 */
public class ThreadB extends Thread{
    private C c;

    public ThreadB(C c) {
        this.c = c;
    }

    @Override
    public void run() {
        while (true){
            c.getValue();
        }
    }
}
