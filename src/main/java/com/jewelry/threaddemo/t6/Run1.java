package com.jewelry.threaddemo.t6;

/**
 * Created by admin on 2019/3/19.
 */
public class Run1 {
    public static void main(String[] args) {
        Thread.currentThread().interrupt();
        System.out.println("是否停止1："+Thread.interrupted());//true
        System.out.println("是否停止2："+Thread.interrupted());//false第一次调用后清除状态，所以为false
    }
}
