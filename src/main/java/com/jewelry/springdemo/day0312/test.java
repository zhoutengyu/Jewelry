package com.jewelry.springdemo.day0312;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(TestConfig.class);
        UseFunctionService useFunctionService=context.getBean(UseFunctionService.class);
        useFunctionService.sayHello("Mike");
        context.close();
    }
}
