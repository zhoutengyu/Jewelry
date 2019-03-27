package com.jewelry.threaddemo.t10;

/**
 * Created by admin on 2019/3/22.
 */
public class Run {
    public static void main(String[] args) {
        String lock=new String("");
        P p=new P(lock);
        C c=new C(lock);
        ThreadA a=new ThreadA(p);
        ThreadB b=new ThreadB(c);
        a.start();
        b.start();
    }
}
