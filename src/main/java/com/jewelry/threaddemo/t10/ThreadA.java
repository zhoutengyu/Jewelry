package com.jewelry.threaddemo.t10;

/**
 * Created by admin on 2019/3/22.
 */
public class ThreadA extends Thread{
    private P p;

    public ThreadA(P p) {
        this.p = p;
    }

    @Override
    public void run() {
        while (true){
            p.setValue();
        }
    }
}
