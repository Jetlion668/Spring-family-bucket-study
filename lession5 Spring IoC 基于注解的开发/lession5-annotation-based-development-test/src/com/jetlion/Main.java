package com.jetlion;

import com.jetlion.controller.UserController;
import com.jetlion.controller.UserController2;
import com.jetlion.controller.UserController3;
import com.jetlion.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserController userController = (UserController) applicationContext.getBean("userController");
        User user = userController.getUserById(1);
        System.out.println(user);


        UserController2 userController2 = (UserController2) applicationContext.getBean("userController2");
        User user2 = userController2.getUserById(2);
        System.out.println(user2);


        UserController3 userController3 = (UserController3) applicationContext.getBean("userController3");
        User user3 = userController3.getUserById(1);
        System.out.println(user3);


    }

}
