package com.jewelry.test;

import com.jewelry.model.vo.User;

import java.util.Arrays;
import java.util.Comparator;

public class TestComparator {
    public static void main(String[] args) {
        User u1=new User("Jack",20);
        User u2=new User("Bob",29);
        User u3=new User("JackZhou",21);
        User[] users={u1,u2,u3};
        Arrays.sort(users, Comparator.comparingInt(User::getAge));
        Arrays.asList(users).stream().forEach(x-> System.out.println(x.getName()));
        Arrays.sort(users, Comparator.comparingInt(u->u.getName().length()));
        Arrays.asList(users).stream().forEach(x-> System.out.println(x.getName()));

        Arrays.sort(users,Comparator.comparing(User::getName,Comparator.nullsFirst(Comparator.reverseOrder())));
        Arrays.asList(users).stream().forEach(x-> System.out.println(x.getName()));



    }
}
