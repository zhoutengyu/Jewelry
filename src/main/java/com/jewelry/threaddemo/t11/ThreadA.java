package com.jewelry.threaddemo.t11;

/**
 * Created by admin on 2019/3/28.
 */
public class ThreadA extends Thread {
    @Override
    public void run() {
        try {
            for(int i=0;i<10;i++){
                System.out.println("ThreadA中的的值"+Tools.t.get());
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
