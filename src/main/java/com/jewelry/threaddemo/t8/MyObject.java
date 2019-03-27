package com.jewelry.threaddemo.t8;

/**
 * Created by admin on 2019/3/20.
 */
public class MyObject {
   synchronized void methodA(){
        try {
            System.out.println("methodA开始运行，threadName="+Thread.currentThread().getName());
            Thread.sleep(1000);
            System.out.println("methodA运行结束");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    synchronized void methodB(){
        try {
            System.out.println("methodB，threadName="+Thread.currentThread().getName());
            Thread.sleep(1000);
            System.out.println("methodB运行结束");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
