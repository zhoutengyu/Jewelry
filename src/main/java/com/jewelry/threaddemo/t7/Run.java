package com.jewelry.threaddemo.t7;

/**
 * Created by admin on 2019/3/19.
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread myThread=new MyThread();
            myThread.start();
            Thread.sleep(2000);
            myThread.interrupt();
        } catch (InterruptedException e) {
            System.out.println("异常出现");
            e.printStackTrace();
        }
    }
}
