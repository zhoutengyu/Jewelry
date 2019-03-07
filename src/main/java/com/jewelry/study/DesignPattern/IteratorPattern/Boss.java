package com.jewelry.study.DesignPattern.IteratorPattern;

public class Boss {
    public static void main(String[] args){
        //这是老方法  缺点：查看不同部门的信息，我们都要在Boss类中增加一段遍历逻辑  这时候可以用迭代器实现，将遍历逻辑封装
//        CompanyMin min = new CompanyMin();
//        List minList = min.getEmployee();
//        for(int i=0;i<minList.size();i++){
//            System.out.println(minList.get(i).toString());
//        }
//
//        CompanyHui hui = new CompanyHui();
//        Employee[] huiArray = hui.getEmployee();
//        for(int i = 0;i<huiArray.length;i++){
//            System.out.println(huiArray[i]);
//        }

        //这是新方法
        CompanyMin min = new CompanyMin();
        check(min.iterator());
        CompanyHui hui = new CompanyHui();
        check(hui.iterator());
    }
    private static void check(Iterattor iterator){
        while(iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
    }
}
