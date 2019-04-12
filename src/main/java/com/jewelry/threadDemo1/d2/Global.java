package com.jewelry.threadDemo1.d2;

import java.util.Random;

/**
 * Created by admin on 2019/4/11.
 */
public class Global {
    static {
        System.out.println("我被初始化了。。。");
    }
    //静态变量，调用时候会初始化该类
    public static int a=1;
    //静态常量，不可变，调用时候不会初始化该类
    public final static int b=1;
    //虽然是静态常量不可变，但是计算复杂，只有在初始化后才能得到结果，调用时候会初始化该类
    public final static int r=new Random().nextInt();


}
