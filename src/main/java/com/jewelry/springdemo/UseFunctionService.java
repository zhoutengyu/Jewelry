package com.jewelry.springdemo;

public class UseFunctionService {
    private FunctionService functionService;

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }
    public void sayHello(String word){
        functionService.sayHello(word);
    }
}
