package com.jewelry.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by admin on 2018/10/30.
 */
public class testMap {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("Jack",20);
        map.put("Mike",30);
        //第一种
        for (Map.Entry<String,Integer> entry:map.entrySet()
             ) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
        //第二种
        for (String k:map.keySet()) {
            System.out.println(k);
        }
        for (Integer k:map.values()) {
            System.out.println(k);
        }

    }
}
