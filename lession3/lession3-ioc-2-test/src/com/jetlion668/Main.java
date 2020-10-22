package com.jetlion668;

import com.jetlion668.entity.Car;
import com.jetlion668.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        User user = (User) applicationContext.getBean("user");
        User user2 = (User) applicationContext.getBean("user");
        System.out.println(user == user2);

        //bean继承
        User user3 = (User) applicationContext.getBean("user3");
        System.out.println(user3);

        //bean继承 属性覆盖
        User user4 = (User) applicationContext.getBean("user4");
        System.out.println(user4);

        //xml文件里面先配置的bean，会先执行其构造方法
        Car car = (Car) applicationContext.getBean("car");


        //如果设置依赖，则先创建依赖对象，才创建包含依赖的对象
        User user5 = (User) applicationContext.getBean("user5");
        Car car2 = (Car) applicationContext.getBean("car2");


        DataSource ds = (DataSource) applicationContext.getBean("dataSource");


        Connection conn = null;
        try {
            conn = ds.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(conn);


        com.jetlion668.entity.DataSource dataSource = (com.jetlion668.entity.DataSource) applicationContext.getBean("DataSource");
        //DataSource{username='Administrator', password='root', driverName='com.mysql.jdbc.Driver', url='jdbc:mysql://192.168.110.123:3306/myTest?useUnicode=true&characterEncoding=UTF-8'}
        //导入配置文件的username value 并不是配置文件里面的值，而是Administrator
        System.out.println(dataSource);


        User user6 = (User) applicationContext.getBean("user6");
        Car car3 = (Car) applicationContext.getBean("car3");
        System.out.println(user6);
    }
}
