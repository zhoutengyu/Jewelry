package com.jewelry.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.stream.IntStream;

public class testTime {
    public static void main(String[] args) {
       /* String a="201909";
        String year=a.substring(0,4);
        String week=a.substring(4,6);
        if(week.startsWith("0")){
            week=week.substring(1,2);
        }
        System.out.println(week);
        Calendar cal = Calendar.getInstance();
        cal.setFirstDayOfWeek(2);
        cal.set(Calendar.YEAR, Integer.parseInt(year)); // 2016年
        cal.set(Calendar.WEEK_OF_YEAR, Integer.parseInt(week)); // 设置为2016年的第10周
        cal.set(Calendar.DAY_OF_WEEK, 2); // 1表示周日，2表示周一，7表示周六
        Date date = cal.getTime();
        System.out.println(date);*/
        IntStream.range(5, 10).boxed().forEach(integer -> System.out.println(integer));
    }
}
