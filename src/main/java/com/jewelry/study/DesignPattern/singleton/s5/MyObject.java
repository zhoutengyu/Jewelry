package com.jewelry.study.DesignPattern.singleton.s5;

/**
 * Created by admin on 2019/4/2.
 */
public class MyObject {
    //静态代码块
    private static MyObject myObject=null;
    private MyObject(){}
    static {
        myObject=new MyObject();
    }
    public static MyObject getInstance(){
        return myObject;
    }
}
