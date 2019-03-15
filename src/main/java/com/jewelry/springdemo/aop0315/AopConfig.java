package com.jewelry.springdemo.aop0315;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by admin on 2019/3/15.
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class AopConfig {
    @Bean
    public Audience audience(){
        return new Audience();
    }

}
