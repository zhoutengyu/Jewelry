package com.jewelry.threaddemo.t13;

/**
 * Created by admin on 2019/4/2.
 */
public class TemplateMethod {
    public final void print(String message){
        System.out.println("---------------------");
        wrapPrint(message);
        System.out.println("---------------------");

    }
    public void wrapPrint(String message){

    }

    public static void main(String[] args) {
        TemplateMethod t=new TemplateMethod(){
            @Override
            public void wrapPrint(String message) {
                System.out.println("***"+message+"***");
            }
        };
        t.print("Hello Word");

        TemplateMethod t1=new TemplateMethod(){
            @Override
            public void wrapPrint(String message) {
                System.out.println("###"+message+"###");
            }
        };
        t1.print("Hello Word");
    }
}
