package com.jewelry.threadDemo1.d2;

import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

/**
 * Created by admin on 2019/4/12.
 */
public class ClassInit {
    static {
        try {
            System.out.println("静态代码块被初始化。。。");
            TimeUnit.MILLISECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        IntStream.range(0,5).forEach(i->new Thread(ClassInit::new));
        System.out.println(String.class.getClassLoader());
        System.out.println(System.getProperty("sun.boot.class.path"));

    }
}
