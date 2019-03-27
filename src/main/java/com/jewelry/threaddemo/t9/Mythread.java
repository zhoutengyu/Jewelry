package com.jewelry.threaddemo.t9;

/**
 * Created by admin on 2019/3/20.
 */
public class Mythread extends Thread {
    @Override
    public void run() {
        super.run();
        Service s=new Service();
        s.service1();
    }
}
