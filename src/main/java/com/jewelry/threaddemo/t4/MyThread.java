package com.jewelry.threaddemo.t4;

/**
 * Created by admin on 2019/3/18.
 */
public class MyThread extends Thread {
    private int count=5;
   /* @Override
    public void run() {
        super.run();
        count--;
        System.out.println("由"+this.currentThread().getName()+"计算，count="+count);
    }*/
   //synchronized线程安全，同步，上锁
   @Override
  synchronized public void run() {
       super.run();
       count--;
       System.out.println("由"+this.currentThread().getName()+"计算，count="+count);
   }
}
