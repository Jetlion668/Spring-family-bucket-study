package com.jetlion;

import com.jetlion.entity.Address;

public class Main {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Address address = (Address) applicationContext.getBean("address");
        System.out.println(address);

    }
}
