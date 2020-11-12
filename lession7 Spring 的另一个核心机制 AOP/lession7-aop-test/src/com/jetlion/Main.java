package com.jetlion;

import com.jetlion.entity.Cal;
import com.jetlion.entity.CalImpl;
import com.jetlion.handler.MyInvocationHandler;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        Cal cal=new CalImpl();
        MyInvocationHandler handler=new MyInvocationHandler();
        Cal cal2 = (Cal) handler.bind(cal);
        cal2.add(10, 3);
        cal2.sub(10, 3);
        cal2.mul(10, 3);
        cal2.div(10, 3);


        /**
         * spring aop
         */
        //加载 spring.xml
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        //获取代理对象
        Cal calImpl = (Cal) applicationContext.getBean("calImpl");
        //执行方法
        calImpl.add(10, 3);
        calImpl.sub(10, 3);
        calImpl.mul(10, 3);
        calImpl.div(10, 3);


    }

}
