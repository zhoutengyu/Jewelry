package com.jewelry.test;

public class Lambda {
    public static void main(String[] args) {
        //()表示没有参数，主体可以是表达式，也可以是一段代码块，用{}括起来
        Runnable runnable=()-> System.out.println("hello word!");
        int a=1;
        //a=4;从lambda 表达式引用的本地变量必须是最终变量或实际上的最终变量
        Runnable runnable1=()->{
            System.out.println(a+3);
        };
        runnable1.run();
    }
}
