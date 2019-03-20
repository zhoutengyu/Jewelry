package com.jewelry.threaddemo.t5;

/**
 * Created by admin on 2019/3/19.
 */
public class Run1 {
    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        Thread t1=new Thread(myThread);
        System.out.println("main begin t1 isAlive=" + t1.isAlive());
        t1.setName("A");
        t1.start();
        System.out.println("main end t1 isAlive=" + t1.isAlive());

       /* 构造器开始
        Thread.currentThread().getName()=:main
        Thread.currentThread().isAlive()=true
        this.getName=Thread-0
        this.isAlive()=false
        构造器结束
        Thread.currentThread()==this :false
        main begin t1 isAlive=false
        main end t1 isAlive=true
        run开始
        Thread.currentThread().getName=A
        Thread.currentThread().isAlive()true
        Thread.currentThread()==this :false
        this.getName()=Thread-0
        this.isAlive()=false
        run结束*/
    }
}
