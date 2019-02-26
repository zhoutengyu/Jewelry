package com.jewelry.test;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.google.common.collect.Lists;
import com.jewelry.model.vo.User;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class test {


    public static void main(String[] args) {
       /* ArrayList<User> humans = Lists.newArrayList(
                new User("20190118", 25),
                new User("20180217", 22),
                new User("20190215", 20),
                new User("20190218", 22)

        );

        for (User u:humans) {
            System.out.println(u.getName()+"\t"+u.getAge());
        }
        humans.sort(Comparator.comparing(User::getAge).thenComparing(User::getName
        ));
        System.out.println("-------------------------------------");
        for (User u:humans) {
            System.out.println(u.getName()+"\t"+u.getAge());
        }*/

        User u1=new User("20190118", 25);
        User u2=   new User("20180217", 22);
        User u3=   new User("20190215", 20);
        List<User> users=new ArrayList<>();

        users.add(u1);
        users.add(u2);
        users.add(u3);
        users.removeIf(x->x.getAge()>24);
        //users.forEach(x-> System.out.println(x.getAge()));
        users.forEach(System.out::println);
    }
}
