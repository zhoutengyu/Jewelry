package com.jewelry.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {
    //Java配置方式
    @Bean//表示返回一个Bean
    public FunctionService functionService(){
        return new FunctionService();
    }
    @Bean
    public UseFunctionService useFunctionService(){
        UseFunctionService useFunctionService=new UseFunctionService();
        useFunctionService.setFunctionService(functionService());
        return useFunctionService;
    }
    //只要容器中存在某个Bean，就可以在另外一个Bean的声明方法中传入
    @Bean
    public UseFunctionService useFunctionService(FunctionService functionService){
        UseFunctionService useFunctionService=new UseFunctionService();
        useFunctionService.setFunctionService(functionService);
        return useFunctionService;
    }

}
