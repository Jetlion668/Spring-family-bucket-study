package com.southwind.test;

import com.southwind.utils.Cal;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        //加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-aop.xml");
        //获取代理对象
        Cal proxy = (Cal) applicationContext.getBean("calImpl");
        proxy.add(10,3);
        proxy.sub(10,3);
        proxy.mul(10,3);
        proxy.div(10,3);
    }
}
