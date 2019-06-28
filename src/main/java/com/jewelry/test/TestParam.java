package com.jewelry.test;

import com.jewelry.model.vo.User;

import java.util.ArrayList;
import java.util.List;

public class TestParam {
    public static void main(String[] args) {
        User user=new User("Mike",20);
        List<User> list=new ArrayList<>();
        list.add(user);
        TestParam testParam=new TestParam();
        testParam.setUsers(list);
        System.out.println(user.getAge());



    }
    private void setUsers(List<User> users){
        for (User user:users
             ) {
            user.setAge(90);
        }

    }
}
