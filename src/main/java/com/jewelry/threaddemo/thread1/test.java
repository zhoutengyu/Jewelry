package com.jewelry.threaddemo.thread1;

/**
 * Created by admin on 2019/3/18.
 */
public class test {
    public static void main(String[] args) {
        //线程启动顺序与start（）执行顺序无关
        MyThread t1=new MyThread(1);
        MyThread t2=new MyThread(2);
        MyThread t3=new MyThread(3);
        MyThread t4=new MyThread(4);
        MyThread t5=new MyThread(5);
        MyThread t6=new MyThread(6);
        MyThread t7=new MyThread(7);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        System.out.println("-------------");
        Runnable runnable=new MyRuannable();
        Thread thread=new Thread(runnable);
        thread.start();

    }
}
