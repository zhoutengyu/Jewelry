package com.jewelry.test;

import com.jewelry.model.vo.User;

import java.util.*;

public class TestCommon {
    public static void main(String[] args) {
       /* String a="hello";
        System.out.println(a.equals("hello"));
        System.out.println(a=="hello");
        System.out.println(a.substring(0,3));
        System.out.println(a.substring(0,3).equals("hel"));
        System.out.println(a.substring(0,3)=="hel");*/
       /* int t=100;
        int o=128;
        Integer.valueOf(t);
        Integer a = 100;
        Integer b = 100;
        Integer m = 128;
        Integer n = 128;
        n.intValue();
        System.out.println(a==t);
        System.out.println(m==o);
        System.out.println(a==b);
        System.out.println(m==n);
        System.out.println(m.equals(n));
        Integer c=new Integer(100);
        Integer d=new Integer(100);
        System.out.println(c==d);
        System.out.println(c.equals(d));*/
       Integer a=-2;
       Long b=-2l;
        Integer m=-2;
        Long n=-2l;
        System.out.println(a.equals(b));
        System.out.println(m.equals(n));
        Map<String,User> map=new HashMap();
        User user=new User("Jack",20);
        map.put("j",user);
        map.forEach((k,v)->{
            System.out.println(v.getAge());
        });
        user.setAge(30);
        map.forEach((k,v)->{
            System.out.println(v.getAge());
        });
    }

}
