package com.jewelry.threaddemo.thread0;

/**
 * Created by admin on 2019/3/18.
 */
public class MyThread1 extends Thread {
    @Override
    public void run() {
           try {
               for (int i=0;i<10;i++){
                   int t= (int)(Math.random()*1000);
                   Thread.sleep(t);
                   System.out.println("Run="+Thread.currentThread().getName());
               }
           } catch (InterruptedException e) {
               e.printStackTrace();
           }


    }
}
