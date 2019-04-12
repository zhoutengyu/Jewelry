package com.jewelry.study.DesignPattern.singleton.s2;

/**
 * Created by admin on 2019/3/29.
 */
public class MyObject {
    //延迟加载模式=懒汉模式
    private static MyObject myObject;
    private MyObject() {
    }
   /* public static MyObject getInstance(){
        //若是多线程环境则会出现多实例情况
        if(myObject!=null){
        }else {
            myObject=new MyObject();
        }
        return myObject;
    }*/
  /* public static MyObject getInstance(){
       //若是多线程环境则会出现多实例情况
       if(myObject!=null){
       }else {
           try {
               //模拟做了一些事情
               Thread.sleep(3000);
               myObject=new MyObject();
           } catch (InterruptedException e) {
               e.printStackTrace();
           }

       }
       return myObject;
   }*/
  //设置同步可以解决线程不安全，但是效率太低了，整个方法被上锁，下个对象想要取得对象，必须等待
   synchronized public static MyObject getInstance(){
       //若是多线程环境则会出现多实例情况
       if(myObject!=null){
       }else {
           try {
               //模拟做了一些事情
               Thread.sleep(3000);
               myObject=new MyObject();
           } catch (InterruptedException e) {
               e.printStackTrace();
           }

       }
       return myObject;
   }
}
