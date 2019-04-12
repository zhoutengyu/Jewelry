package com.jewelry.threadDemo1.d1;

/**
 * Created by admin on 2019/4/3.
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        Thread thread=new Thread(()->{
            while (true){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        //如果一个jvm进程中没有一个非守护线程，jvm就会自动退出，守护线程具备自动结束生命周期的特点
        //守护线程经常用来执行一些后台任务，也称后台线程，当你希望退出jvm进程时，一些线程自动关闭，就可考虑守护线程
        thread.setDaemon(true);
       // thread.setDaemon(false);设置守护线程
        thread.start();thread.interrupt();
        Thread.sleep(2_000L);
        System.out.println("main结束");

    }
}
