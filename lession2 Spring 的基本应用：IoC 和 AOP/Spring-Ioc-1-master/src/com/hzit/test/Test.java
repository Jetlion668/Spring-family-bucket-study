package com.hzit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hzit.entity.Classes;
import com.hzit.entity.Student;

public class Test {
	public static void main(String[] args) {
		//�˴���Ҫһ��student����
		//�������ֶ�new�����Ķ���
//		Student student = new Student();
//		System.out.println(student);
		//IOC ������ֻ��Ҫ��IOC������ȡ���ö���
		//1.����spring.xml�����ļ�
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		//ͨ����������ȡ����
//		Student stu = (Student) applicationContext.getBean("stu");
//		System.out.println(stu);
//		Student stu2 = (Student) applicationContext.getBean("stu");
//		System.out.println(stu2);
		//ͨ������ʱ���ȡ����
//		Student stu2 = (Student) applicationContext.getBean(Student.class);
//		System.out.println(stu2);
//		Student stu3 = (Student) applicationContext.getBean("stu3");
//		System.out.println(stu3);
		
		//����
//		Student stu = (Student) applicationContext.getBean("stu");
//		System.out.println(stu);
		
//		Student stu = (Student) applicationContext.getBean("stu");
//		System.out.println(stu);
		
		Classes classes = (Classes) applicationContext.getBean("classes");
		System.out.println(classes);
	}
}
