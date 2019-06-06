package com.jewelry.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.BeforeFilter;
import com.alibaba.fastjson.serializer.PropertyFilter;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.jewelry.model.vo.User;
import org.apache.poi.xslf.model.PropertyFetcher;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class TestObjectMapper {
    public  static ObjectMapper mapper=new ObjectMapper();
    static {
        // 转换为格式化的json
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        // 如果json中有新增的字段并且是实体类类中不存在的，不报错
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        //设置日期格式
        mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
    }

    public static void main(String[] args) throws Exception{
        User user=new User("Jack",20,new Date());
        Map<String,User> map=new HashMap<>();
        map.put("user",user);
       // mapper.writeValue(new File("C:/test.txt"),user);
        System.out.println("对象转json字符串："+mapper.writeValueAsString(user));
        System.out.println("map转json字符串："+mapper.writeValueAsString(map));
        PropertyFilter filter=new PropertyFilter() {
            @Override
            public boolean apply(Object o, String name, Object value) {
                if ("age".equals(name)) {
                    int id = ((Integer) value).intValue();
                    return id >= 10;
                }
                return false;
            }

        };
        System.out.println("字段名和值过滤："+JSON.toJSONString(user,filter));
        BeforeFilter  beforeFilter= new BeforeFilter() {
            @Override
            public void writeBefore(Object o) {
                writeKeyValue("作者","zty");
            }
        };
        System.out.println("增加前缀："+JSON.toJSONString(user,beforeFilter));
        //BiFunction



    }

}
