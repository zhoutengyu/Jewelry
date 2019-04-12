package com.jewelry.study.DesignPattern.singleton.s4;

/**
 * Created by admin on 2019/4/2.
 */
public class MyObject {
    //内部类方式
    private static class MyObjectHandel{
        private static MyObject myObject=new MyObject();

    }
    private MyObject(){}
    public static MyObject getInstance(){
        return MyObjectHandel.myObject;
    }
}
