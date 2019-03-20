package com.jewelry.threaddemo.t5;

/**
 * Created by admin on 2019/3/18.
 */
public class Run {
    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        myThread.setName("B");
        /*构造器:main
        run方法：Thread-0*/
        myThread.start();
       /* 构造器:main
        run方法：main*/
        //myThread.run();

       /* 构造器开始
        Thread.currentThread().getName()=:main
        Thread.currentThread().isAlive()=true
        this.getName=Thread-0
        this.isAlive()=false
        构造器结束
        Thread.currentThread()==this :false
        run开始
        Thread.currentThread().getName=B
        Thread.currentThread().isAlive()true
        Thread.currentThread()==this :true
        this.getName()=B
        this.isAlive()=true
        run结束*/
    }
}
