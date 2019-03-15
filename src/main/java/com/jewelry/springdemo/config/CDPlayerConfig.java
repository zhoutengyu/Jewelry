package com.jewelry.springdemo.config;

import com.jewelry.springdemo.day0313.CDPlayer;
import com.jewelry.springdemo.day0313.CompactDisc;
import com.jewelry.springdemo.day0313.SgtPeppers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by admin on 2019/3/13.
 */
@Configuration
//@ComponentScan 如没有设置，默认Spring将会扫描这个包以及这个包下的所有子包，查找带有@Component注解的类。
//可设置扫描多个包，以，分隔，还可以指定类
//@ComponentScan(basePackageClasses = {SgtPeppers.class, CompactDisc.class})
//@ComponentScan(basePackages = "com.jewelry.springdemo.day0313")  自动化装配
public class CDPlayerConfig {
    @Bean//一定要用public 不能private
    public CompactDisc sgtPeppers(){
        return  new SgtPeppers();
    }
   /* @Bean
    public CDPlayer cdPlayer(CompactDisc cd){
        return new CDPlayer(cd);
    }*/
    @Bean
    public CDPlayer cdPlayer(){
        return new CDPlayer(sgtPeppers());
    }
}
