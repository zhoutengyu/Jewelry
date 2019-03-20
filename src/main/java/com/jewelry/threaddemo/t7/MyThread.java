package com.jewelry.threaddemo.t7;

/**
 * Created by admin on 2019/3/19.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
     try {
         for (int i=0;i<500000;i++){
             if(this.interrupted()){
                 System.out.println("已经停止了，我要退出了");
                 //使用抛异常的方式停止线程（推荐），还可以retun方法
                 throw new InterruptedException();
                 //retun;
             }
             System.out.println("i="+(i+1));
         }
         System.out.println("我在for循环下面。。。。。");
     }catch (InterruptedException e){
         System.out.println("捕获异常了");
         e.printStackTrace();

     }

    }
}
