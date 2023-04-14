package com.springcore.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Student_test {
public static void main(String[] args) {
	ApplicationContext c=new ClassPathXmlApplicationContext("StereoConfig.xml");
Student1 student1=c.getBean("ob",Student1.class);
//System.out.println(student1);
//System.out.println(student1.getAddress());
System.out.println(student1.hashCode());
Student1 student2=c.getBean("ob",Student1.class);
System.out.println(student2.hashCode());
}
}
