package com.springcore.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ref_main {
public static void main(String[] args) {
	ApplicationContext c=new ClassPathXmlApplicationContext("config.xml");
	A a=(A) c.getBean("aref");
	System.out.println(a.getX());
	System.out.println(a.getOb().getY());
	System.out.println(a);
}
}
