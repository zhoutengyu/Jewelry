package com.jewelry.test;

public class ConsumerServer {
    public  static void  repeat(int n,IntConsumer action){
        for (int i=1;i<n;i++) action.accept(i);

    }
}
