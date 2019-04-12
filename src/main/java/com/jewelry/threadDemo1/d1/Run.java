package com.jewelry.threadDemo1.d1;

import java.util.stream.IntStream;

/**
 * Created by admin on 2019/4/2.
 */
public class Run {
    public static void main(String[] args) {
       /*final TicketRunaable t=new TicketRunaable();
        Thread t1=new Thread(t,"一号窗口");
        Thread t2=new Thread(t,"二号窗口");
        Thread t3=new Thread(t,"三号窗口");
        Thread t4=new Thread(t,"四号窗口");
        t1.start();
        t2.start();
        t3.start();
        t4.start();*/

        IntStream.range(0,5).boxed().forEach(x->new Thread(()-> System.out.println(Thread.currentThread().getName())).start());
    }



}
