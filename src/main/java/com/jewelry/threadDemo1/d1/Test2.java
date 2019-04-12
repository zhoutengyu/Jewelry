package com.jewelry.threadDemo1.d1;

import java.util.concurrent.TimeUnit;

/**
 * Created by admin on 2019/4/8.
 */
public class Test2 {
    public static void main(String[] args) {
        System.out.println("main线程是否中断："+Thread.interrupted());
        Thread.currentThread().interrupt();
        System.out.println("main线程是否中断："+Thread.currentThread().isInterrupted());
        try {
            TimeUnit.MINUTES.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("捕获异常");
        }
    }
}
