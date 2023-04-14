package com.springcore.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Autowire_test {
public static void main(String[] args) {
	ApplicationContext c=new ClassPathXmlApplicationContext("config.xml");
	Employee emp2=c.getBean("emp2",Employee.class);
	System.out.println(emp2);
	
}
}
