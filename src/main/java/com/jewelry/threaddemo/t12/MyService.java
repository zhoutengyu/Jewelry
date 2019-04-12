package com.jewelry.threaddemo.t12;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by admin on 2019/3/28.
 */
public class MyService {
    private Lock lock=new ReentrantLock();
    private Condition condition=lock.newCondition();
   /* public void TestLock(){
        lock.lock();
        for(int i=0;i<10;i++){
            System.out.println("线程名称："+Thread.currentThread().getName());
        }
        lock.unlock();
    }*/
   public void waitTest(){
       try {
           lock.lock();
           System.out.println("A");
           condition.await();
           System.out.println("B");
       } catch (InterruptedException e) {
           e.printStackTrace();
       }finally {
           lock.unlock();
           System.out.println("释放了");
       }
   }
}
