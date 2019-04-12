package com.jewelry.study.DesignPattern.singleton.s1;

/**
 * Created by admin on 2019/3/29.
 * 0;就一个实例，则不能被实例化，所有构造函数私有的
   1:提供一个实例
   2:提供一个供外部访问的方法
 */
public class MyObject {
    //立即加载模式=饿汉模式
    private static MyObject myObject=new MyObject();
    private MyObject() {
    }
    public static MyObject getInstance(){
        //立即加载，缺点不能有其他实例变量，getInstance没有同步，可能有线程不安全。
        return myObject;
    }
}
