package com.jewelry.threaddemo.t10;

/**
 * Created by admin on 2019/3/22.
 */
public class C {
    private String lock;

    public C(String lock) {
        this.lock = lock;
    }
    public void getValue(){
        try {
            synchronized (lock){
                if(ValueObject.value.equals("")){
                    lock.wait();
                }
                System.out.println("get值:"+ValueObject.value);
                ValueObject.value="";
                lock.notify();
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
