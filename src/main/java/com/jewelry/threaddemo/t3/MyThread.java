package com.jewelry.threaddemo.t3;

/**
 * Created by admin on 2019/3/18.
 */
public class MyThread extends Thread {
    private int count=5;

    public MyThread(String name) {
        super();
        this.setName(name);
    }

    @Override
    public void run() {
        super.run();
        while (count>0){
            count--;
            System.out.println("由"+this.currentThread().getName()+"计算，count="+count);
        }
    }
}
