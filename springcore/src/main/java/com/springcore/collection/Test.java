package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.springcore.Student;

public class Test {

	public static void main(String[] args) {
		// our config file are not present in src/main/java so we have to give full path
		ApplicationContext Context = new ClassPathXmlApplicationContext(
				"com/springcore/collection/collectionconfig.xml");
		Empl emp1 = (Empl) Context.getBean("emp1");
		System.out.println(emp1);
	}

}
