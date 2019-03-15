package com.jewelry.springdemo.aop0315;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by admin on 2019/3/15.
 */
@Aspect
public class Audience {
    @Pointcut("execution(**com.jewelry.springdemo.aop0315.Performance.perform())")
    public void performance(){}
    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint joinPoint){
        try {
            System.out.println("表演马上开始，请安静。。。");
            joinPoint.proceed();
            System.out.println("啦啦啦啦啦啦，太精彩了！");
        } catch (Throwable throwable) {
            System.out.println("出现意外");
        }

    }
}
