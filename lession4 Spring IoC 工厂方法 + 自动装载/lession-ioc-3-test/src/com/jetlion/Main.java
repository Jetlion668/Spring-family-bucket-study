package com.jetlion;

import com.jetlion.entity.Car;
import com.jetlion.entity.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {


    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Car car1 = (Car) applicationContext.getBean("car1");
        System.out.println(car1);

        Car car2 = (Car) applicationContext.getBean("car2");
        System.out.println(car2);


        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);
    }
}
