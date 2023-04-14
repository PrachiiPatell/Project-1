package com.springcore.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Food_test {
public static void main(String[] args) {
	AbstractApplicationContext c=new ClassPathXmlApplicationContext("config.xml");
	c.registerShutdownHook();
	Food f1=(Food) c.getBean("f1");
	System.out.println(f1);
	
	
	System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	Pepsi p1=(Pepsi) c.getBean("p1");
		System.out.println(p1);
	
}
}
