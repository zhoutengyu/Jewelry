package com.jewelry.springdemo.day0524;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanWayService {
    @PostConstruct
    public void init(){
        System.out.println("构造完成后");
    }
    public BeanWayService() {
        System.out.println("初始化构造函数");
    }
    @PreDestroy
    public void destory(){
        System.out.println("Bean销毁之前执行");
    }
    public void doSomething(){
        System.out.println("滚滚滚");
    }
}
