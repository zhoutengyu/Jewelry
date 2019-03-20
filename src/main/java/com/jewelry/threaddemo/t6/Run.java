package com.jewelry.threaddemo.t6;

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
            //interrupted测试当前线程是否中断，这个当前线程是main，从未停止过
            System.out.println("是否停止1："+myThread.interrupted());//false
            System.out.println("是否停止2："+myThread.interrupted());//false
        } catch (InterruptedException e) {
            System.out.println("异常出现");
            e.printStackTrace();
        }
    }
}
