package com.jewelry.threaddemo.t4;

/**
 * Created by admin on 2019/3/18.
 */
public class Run {
    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        Thread a=new Thread(myThread,"A");
        Thread b=new Thread(myThread,"B");
        Thread c=new Thread(myThread,"C");
        Thread d=new Thread(myThread,"D");
        Thread e=new Thread(myThread,"E");
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();


       /* 由A计算，count=3         线程不安全，A，B同时都是3
        由E计算，count=0
        由C计算，count=2
        由D计算，count=1
        由B计算，count=3*/

       //加了synchronized后，使得在多个线程执行run方法时，以排队的方式进行。count按顺序递减
        /*由A计算，count=4
        由B计算，count=3
        由E计算，count=2
        由C计算，count=1
        由D计算，count=0*/
    }
}
