package com.jewelry.study.DesignPattern.IteratorPattern;

public class CompanyHui implements Company {
    private Employee[] array = new Employee[3];

    public CompanyHui(){
        array[0] = new Employee("辉哥",108,"男","程序猿");
        array[1] = new Employee("小红",98,"男","测试");
        array[2] = new Employee("小辉",88,"男","测试");
    }

    public Employee[] getEmployee(){
        return array;
    }

    @Override
    public Iterattor iterator() {
        return new HuiIterator(array);
    }
}
