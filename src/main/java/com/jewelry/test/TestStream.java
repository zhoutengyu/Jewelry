package com.jewelry.test;

import com.jewelry.model.vo.User;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class TestStream {
    public static void main(String[] args) {
        User u1=new User("Make", 25,"男");
        User u2=   new User("JackZhou", 22,"女");
        User u3=   new User("Tom", 20,"女");
        User u4=   new User("Bob", 60,"女");
        List<User> users=new ArrayList<>();
        users.add(u1);
        users.add(u2);
        users.add(u3);
        users.add(u4);
        long count = users.stream().filter(x -> x.getAge() > 22).count();
        List<User> collect = users.stream().filter(x -> x.getAge() > 22).collect(Collectors.toList());
        //collect.forEach(x->System.out.println(x.getAge()));
        List<Integer> ages =users.stream().map(x->x.getAge()).collect(Collectors.toList());
        int a=users.stream().map(x->x.getAge()).reduce(0,(x,y)->x+y);
        //System.out.println(a);
        //users.stream().map(User::getAge).collect(Collectors.toList());
        //ages.forEach(System.out::println);
        List<String> strings = Stream.of("a", "me", "hello").map(x -> x.toUpperCase()).collect(Collectors.toList());
        //System.out.println(strings);

        //最小，最大
       User user= users.stream().max(Comparator.comparing(User::getAge)).get();
        //System.out.println(user.getName()+":"+user.getAge());
       IntSummaryStatistics summaryStatistics= users.stream().mapToInt(x->x.getAge()).summaryStatistics();
        //System.out.println("平均："+summaryStatistics.getAverage());

        Optional<String> optional=Optional.empty();//Optional.ofNullable(null);
        //System.out.println(optional.isPresent());
        //System.out.println(optional.orElse("b"));
        //System.out.println(optional.orElseGet(()->"c"));
        users.stream().collect(Collectors.toCollection(TreeSet::new));
       Map<Boolean,List<User>> map= users.stream().collect(partitioningBy(x->x.getAge()>22));
       // map.get(false).forEach(x-> System.out.println(x.getAge()));
       Map<String,List<User>> map1= users.stream().collect(groupingBy(x->x.getSex()));
        Map<String,Long> s= users.stream().collect(groupingBy(x->x.getSex(),counting()));
        System.out.println(users.stream().collect(groupingBy(x->x.getSex(),counting())).get("男"));
        

       //map1.get("女").forEach(x-> System.out.println(x.getName()));
        String str=users.stream().map(User::getName).collect(joining("-","[","}"));
        //System.out.println(str);




    }
}
