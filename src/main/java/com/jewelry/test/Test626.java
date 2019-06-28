package com.jewelry.test;

import com.jewelry.model.vo.User;
import org.springframework.beans.BeanUtils;

import java.util.*;
import java.util.stream.Collectors;

public class Test626 {
    public static void main(String[] args) {
       /* User u0=new User("Tom",20);
        User u1=new User("Tom",20);
        User u2=new User("Mike",30);
        User u3=new User("Mike",30);
        List<User> list=new ArrayList<>();
        list.add(u0);
        list.add(u1);
        list.add(u2);
        list.add(u3);
       // List<User> collect = list.stream().distinct().collect(Collectors.toList());

        List<User> collect = list.stream().collect(Collectors.collectingAndThen(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(User::getName))), ArrayList::new));

        System.out.println(collect);*/

        User u0=new User("Tom",20);
        User u2=new User("Mike",30);
        List<User> list=new ArrayList<>();
        list.add(u0);
        list.add(u2);
        Map<Integer, List<User>> collect = list.stream().collect(Collectors.groupingBy(User::getAge));
        collect.forEach((k,v)-> System.out.println(k));

        Map<Integer, List<User>>  integerListNavigableMap = list.stream().collect(Collectors.groupingBy(User::getAge, TreeMap::new, Collectors.toList())).descendingMap();
        integerListNavigableMap.forEach((k,v)-> System.out.println(k));

    }
}
