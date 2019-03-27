package com.jewelry.threaddemo.t9;

/**
 * Created by admin on 2019/3/20.
 */
public class Service {
    synchronized public void service1(){
        System.out.println("服务1");
        service2();
    }
    synchronized public void service2(){
        System.out.println("服务2");
        service3();
    }
    synchronized public void service3(){
        System.out.println("服务3");
    }
}
