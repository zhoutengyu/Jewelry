package com.jewelry.study.DesignPattern.singleton.s3;

/**
 * Created by admin on 2019/4/2.
 */
public class MyObject {
    //dcl双锁检查机制
    private volatile static MyObject myObject;
    private MyObject() {
    }
    public static MyObject getInstance(){
        //若是多线程环境则会出现多实例情况
        if(myObject!=null){
        }else {
            try {
                //模拟做了一些事情
                Thread.sleep(3000);
                synchronized (MyObject.class){
                    if(myObject==null){
                        myObject=new MyObject();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        return myObject;
    }
}
