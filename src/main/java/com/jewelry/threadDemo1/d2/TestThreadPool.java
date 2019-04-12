package com.jewelry.threadDemo1.d2;

import java.util.concurrent.*;

/**
 * Created by admin on 2019/4/11.
 */
public class TestThreadPool {
    public static void main(String[] args) {
       /* ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 10, 200, TimeUnit.MILLISECONDS,
                new ArrayBlockingQueue<Runnable>(5)
        );*/
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);
        for(int i=0;i<15;i++){
            MyTask myTask=new MyTask(i);
            executor.execute(myTask);
            System.out.println("线程池中线程数目："+executor.getPoolSize()+"，队列中等待执行的任务数目："+
                    executor.getQueue().size()+"，已执行玩别的任务数目："+executor.getCompletedTaskCount());

        }
        executor.shutdown();

    }
    static class MyTask implements Runnable{
        private  int taskNum;

        public MyTask(int taskNum) {
            this.taskNum = taskNum;
        }

        @Override
        public void run() {
            System.out.println("正在执行task"+taskNum);
            try {
                Thread.currentThread().sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("task"+taskNum+"执行完毕");

        }
    }
}
