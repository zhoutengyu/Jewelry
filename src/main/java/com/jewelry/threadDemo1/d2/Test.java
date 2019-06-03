package com.jewelry.threadDemo1.d2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by admin on 2019/4/11.
 */
public class Test {
    public static void main(String[] args) {
        //int a = Global.r;
        SimpleDateFormat sdf = new SimpleDateFormat("MMddHHmm");
        System.out.println(sdf.format(new Date()));
        Map<String,Object> map=new HashMap<>();
        map.put("a",1);
        map.put("a",2);
        System.out.println(map.get("a"));
    }
}
