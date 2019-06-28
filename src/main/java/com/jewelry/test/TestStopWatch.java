package com.jewelry.test;

import org.springframework.util.StopWatch;

public class TestStopWatch  {
    public void test() throws InterruptedException{
        StopWatch sw=new StopWatch();
        sw.start("起床");
        Thread.sleep(1000);
        sw.stop();
        System.out.println(sw.getTotalTimeMillis());
        sw.start("洗漱");
        Thread.sleep(2000);
        sw.stop();
        System.out.println(sw.getTotalTimeMillis());

        sw.start("锁门");
        Thread.sleep(500);
        sw.stop();
        System.out.println(sw.getTotalTimeMillis());


        System.out.println(sw.prettyPrint());
        System.out.println(sw.getTotalTimeMillis());
        System.out.println(sw.getLastTaskName());
        System.out.println(sw.getLastTaskInfo());
        System.out.println(sw.getTaskCount());

    }

    public static void main(String[] args) throws Exception{
        TestStopWatch testStopWatch = new TestStopWatch();
        testStopWatch.test();
    }
}
