package com.qianfeng;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        //完成Spring.xml文件的解析和Spring容器的初始化
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

        Maleader maleader = applicationContext.getBean(Maleader.class);

        System.out.println(maleader.getWater().getName());

        //name是类名字的首字母小写
//        MaLeader leader = (MaLeader) applicationContext.getBean("leader");
//        System.out.println(leader.getWater().getName());
    }
    }

