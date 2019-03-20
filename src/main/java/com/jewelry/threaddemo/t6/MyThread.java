package com.jewelry.threaddemo.t6;

/**
 * Created by admin on 2019/3/19.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        /*for (int i=0;i<100;i++){
            System.out.println("i="+(i+1));
        }*/
        for (int i=0;i<500000;i++){
            if(this.interrupted()){
                System.out.println("已经停止了，我要退出了");
                break;

            }
            System.out.println("i="+(i+1));
        }
        System.out.println("停止后，还在输出，线程并未停止");
    }
}
