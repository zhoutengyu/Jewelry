package com.jewelry.threaddemo.thread0;

/**
 * Created by admin on 2019/3/18.
 */
public class Test {
    public static void main(String[] args) {
        //Thread.currentThread()  当前线程
        //System.out.println(Thread.currentThread().getName());
        //打印结果为： 运行结束   我的线程开始了。。。。
        // 说明使用多线程技术时，代码运行结果与执行顺序或者调用顺序无关
       // MyThread myThread=new MyThread();
       // myThread.start();
        //第二次调用会报错Exception in thread "main" java.lang.IllegalThreadStateException
        //myThread.start();
        //System.out.println("运行结束");
        System.out.println("--------------------------");
        MyThread1 myThread1=new MyThread1();
        myThread1.setName("myThread1");
        //myThread1.run();就不是异步执行了而是同步
        //myThread1.start();则是异步，类似交给线程规划器，表示已经准备就绪，等待执行。
        myThread1.start();
        try {
            for (int i=0;i<10;i++){
                int t= (int)(Math.random()*1000);
                Thread.sleep(t);
                System.out.println("main="+Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
