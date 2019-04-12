package com.jewelry.threadDemo1.d1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by admin on 2019/4/2.
 */
public class TicketRunaable implements Runnable {
    private  int index=1;
    private  final static int MAX=50;
    private Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true){
            lock.lock();
            if (index<=MAX){
                System.out.println(Thread.currentThread().getName()+"的号码是"+(index++));
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            lock.unlock();
        }


    }

}
