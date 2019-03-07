package com.jewelry.study.DesignPattern.IteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class CompanyMin implements Company {
    private List<Employee> list = new ArrayList<>();

    public CompanyMin(){
        list.add(new Employee("小民",96,"男","程序猿"));
        list.add(new Employee("小芸",22,"女","测试"));
        list.add(new Employee("小方",18,"女","测试"));
        list.add(new Employee("可儿",21,"女","设计"));
        list.add(new Employee("朗情",19,"女","设计"));
    }

    public List<Employee> getEmployee(){
        return list;
    }


    /**
     * 新加的
     * */
    @Override
    public Iterattor iterator() {
        return new MinIterator(list);
    }

}
