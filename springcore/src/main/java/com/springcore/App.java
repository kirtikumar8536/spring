package com.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext Context = new ClassPathXmlApplicationContext("config.xml");
		Student student1 = (Student) Context.getBean("student1");
		System.out.println(student1);

		Student student2 = (Student) Context.getBean("student2");
		System.out.println(student2);
		// using p schema
		Student student3 = (Student) Context.getBean("student3");
		System.out.println(student3);

	}
}
