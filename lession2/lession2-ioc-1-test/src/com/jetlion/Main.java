package com.jetlion;

import com.jetlion.entity.Classes;
import com.jetlion.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        //1.加载 spring.xml 配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        //2.通过 id 值获取对象
        Student stu = (Student) applicationContext.getBean("stu");
        Student stu2 = (Student) applicationContext.getBean("stu2");
        //通过构造函数创建对象
        Student stu3 = (Student) applicationContext.getBean("stu3");
        System.out.println(stu);
        System.out.println(stu2);
        System.out.println(stu3);

        //依赖注入（DI）
        Student stu4 = (Student) applicationContext.getBean("stu4");
        System.out.println(stu4);

        //集合属性依赖注入
        Classes classes4= (Classes) applicationContext.getBean("classes2");
        System.out.println(classes4);
    }

}
