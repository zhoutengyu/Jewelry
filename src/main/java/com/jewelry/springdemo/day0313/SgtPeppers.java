package com.jewelry.springdemo.day0313;

import org.springframework.stereotype.Component;

/**
 * Created by admin on 2019/3/13.
 */
//表示这是一个组件类，并告知spring要为这个类创建bean
//@Component("testname")  为bean自定义命名，默认为方法名首字母替换为小写字母，即sgtPeppers

@Component
public class SgtPeppers implements CompactDisc {
    @Override
    public void play() {
        System.out.println("我来到你的城市，熟悉的哪一条街。。。。");
    }
}
