package com.jewelry.threaddemo.t5;

/**
 * Created by admin on 2019/3/18.
 */
public class MyThread extends Thread {
    public MyThread() {
        System.out.println("构造器开始");
        System.out.println("Thread.currentThread().getName()=:"+Thread.currentThread().getName());
        System.out.println("Thread.currentThread().isAlive()=" + Thread.currentThread().isAlive()); //查看线程是否存活
        System.out.println("this.getName=" + this.getName());
        System.out.println("this.isAlive()=" + this.isAlive());
        System.out.println("构造器结束");
        System.out.println("Thread.currentThread()==this :"+ (Thread.currentThread() == this));
    }

    @Override
    public void run() {
        super.run();
        System.out.println("run开始");
        System.out.println("Thread.currentThread().getName=" + Thread.currentThread().getName());
        System.out.println("Thread.currentThread().isAlive()" + Thread.currentThread().isAlive());
        System.out.println("Thread.currentThread()==this :"+ (Thread.currentThread() == this));
        System.out.println("this.getName()=" + this.getName());
        System.out.println("this.isAlive()=" + this.isAlive());
        System.out.println("run结束");
    }
}
