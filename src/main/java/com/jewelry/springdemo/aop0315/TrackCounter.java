package com.jewelry.springdemo.aop0315;

import org.aspectj.lang.annotation.Aspect;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by admin on 2019/3/15.
 */
@Aspect
public class TrackCounter {
    private Map<Integer,Integer> map=new HashMap<>();

}
