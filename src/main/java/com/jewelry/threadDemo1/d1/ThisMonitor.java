package com.jewelry.threadDemo1.d1;

import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by admin on 2019/4/9.
 */
public class ThisMonitor {
    public synchronized void method1(){
        System.out.println(Thread.currentThread().getName()+"进入method1");
        try {
            TimeUnit.MINUTES.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public synchronized void method2(){
        System.out.println(Thread.currentThread().getName()+"进入method2");
        try {
            TimeUnit.MINUTES.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ThisMonitor monitor=new ThisMonitor();
        new Thread(monitor::method1).start();
        new Thread(monitor::method2).start();
       new  HashMap<Integer,Integer>();


    }
}
