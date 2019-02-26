package com.jewelry.test;

import com.jewelry.model.vo.User;
import com.jewelry.utils.DateTimeUtils;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.springframework.util.CollectionUtils;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

/**
 * Created by admin on 2018/10/30.
 */
public class testMap {
    public static void main(String[] args) {
      /*  Map<String,Integer> map=new HashMap<>();
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
        }*/
       /* LocalDate localDate = LocalDate.now().plusDays(100);
        System.out.println(localDate.getYear());
        System.out.println(localDate.getMonthValue());
        System.out.println(localDate.getDayOfMonth());*/
       /* Date start=new Date();
        while (true){

            Date end=new Date();
            try {
                Thread.sleep(500);
               int a=1/0;
            } catch (Exception e) {
                e.printStackTrace();
            }

            if((end.getTime()-start.getTime())/(1000*60)>=1){
                break;
            }

        }*/
/*
       Set<Long> set=new HashSet<>();
       set.add(1L);
        set.add(1L);
        set.add(null);
        set.add(2L);
        String a=StringUtils.join(set.toArray(),",");
        System.out.println(a+"wwww");
*/

        /*System.out.println(new Date().toString());
        Long a=200L;
        System.out.println(a.intValue()==200);*/
       /* DateTime minus = DateTime.now().minusDays(2);
        Date date2 = minus.toDate();
        String date="2019-11-29 00:00:00";
        Date date1 = DateTimeUtils.parseDate(date, "yyyy-MM-dd HH:mm:ss");

        System.out.println(date2.after(date1));
        System.out.println(minus.toString("yyyy-MM-dd"));*/
        User u1=new User("20190118", 25);
        User u2=   new User("20180217", 22);
        User u3=   new User("20190215", 20);
        List<User> users=new ArrayList<>();
        User[] list=new User[3];
        list[0]=new User("20190118", 25);
        list[1]=new User("20190128", 23);
        list[2]=new User("20190118", 28);

        users.add(u1);
        users.add(u2);
        users.add(u3);
        users.removeIf(x->x.getAge()>24);
        users.forEach(x-> System.out.println(x.getAge()));
        System.out.println(users.toString());
        Arrays.sort(list);
        for (User u:list
             ) {
            System.out.println(u.getAge());
        }
        System.out.println(Integer.compare(1,2));
        String s[]={"2","2225555","11","44444"};
        System.out.println(Arrays.toString(s));

        //Arrays.sort(s,new LengthComparator());
        //Lambda表达式
        Arrays.sort(s,(a,b)->a.length()-b.length());
        System.out.println(Arrays.toString(s));


    }
}
