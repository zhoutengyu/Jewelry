package com.jewelry.threaddemo.t6;

/**
 * Created by admin on 2019/3/19.
 */
public class Run2  {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(1000);
            thread.interrupt();
            System.out.println("是否停止1？="+thread.isInterrupted());//true
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
