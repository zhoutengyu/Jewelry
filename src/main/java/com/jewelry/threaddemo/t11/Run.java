package com.jewelry.threaddemo.t11;

/**
 * Created by admin on 2019/3/28.
 */
public class Run {
    public static void main(String[] args) {
        try {
            for(int i=0;i<10;i++){
                System.out.println("Main中的的值"+Tools.t.get());
                Thread.sleep(200);
            }
            Thread.sleep(5000);
            ThreadA a=new ThreadA();
            a.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
