package com.jewelry.threaddemo.t8;

/**
 * Created by admin on 2019/3/20.
 */
public class Run {
    public static void main(String[] args) {
        MyObject myObject=new MyObject();
        ThreadA threadA=new ThreadA(myObject);
        threadA.setName("A");
        ThreadB threadB=new ThreadB(myObject);
        threadB.setName("B");
        threadA.start();
        threadB.start();
    }
}
