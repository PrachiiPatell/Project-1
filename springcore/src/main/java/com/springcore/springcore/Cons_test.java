package com.springcore.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Cons_test {
public static void main(String[] args) {
	ApplicationContext c=new ClassPathXmlApplicationContext("config.xml");
		Person p=(Person) c.getBean("person");
		System.out.println(p);
}
}
