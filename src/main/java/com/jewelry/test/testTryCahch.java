package com.jewelry.test;

import com.jewelry.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class testTryCahch {
    @Autowired
    private UserService userService;
    public static void main(String[] args) {
        try {
            Test1();
        }catch (Exception e){
            System.out.println(e.getMessage());

        }
        System.out.println("helo!!!");
         //Test1();

    }

    public static int Test1(){
        int a=1/0;
/*        int x = 5;
        try
        {
            int num=x / 0;
            System.out.println(num);
        }
        catch (ArithmeticException e) {
            System.err.println("除数不能为0！");
            return 6;
        }
        finally
        {
            ++x;
            System.out.println("finally");
        }*/
        return 2;
    }
}
