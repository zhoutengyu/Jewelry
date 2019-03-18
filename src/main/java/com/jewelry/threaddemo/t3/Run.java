package com.jewelry.threaddemo.t3;

/**
 * Created by admin on 2019/3/18.
 */
public class Run {
    public static void main(String[] args) {
        Thread a=new MyThread("A");
        Thread b=new MyThread("B");
        Thread c=new MyThread("C");
        a.start();
        b.start();
        c.start();
        //结果如下，不共享数据，ABC各自都有自己的count变量，自己减少自己的
 /*  由C计算，count=4
        由B计算，count=4
        由A计算，count=4
        由B计算，count=3
        由C计算，count=3
        由B计算，count=2
        由A计算，count=3
        由B计算，count=1
        由B计算，count=0
        由C计算，count=2
        由C计算，count=1
        由A计算，count=2
        由C计算，count=0
        由A计算，count=1
        由A计算，count=0*/
    }
}
