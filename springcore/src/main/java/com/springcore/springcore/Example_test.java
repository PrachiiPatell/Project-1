package com.springcore.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Example_test {
public static void main(String[] args) {
	AbstractApplicationContext c1=new ClassPathXmlApplicationContext("config.xml");
	c1.registerShutdownHook();
	Example example=(Example) c1.getBean("example");
	System.out.println(example);
}
}
