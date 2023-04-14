package com.springcore.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Stud_test {
public static void main(String[] args) {
	//ApplicationContext c=new ClassPathXmlApplicationContext("StereoConfig.xml");
	ApplicationContext c=new AnnotationConfigApplicationContext(JavaConfig.class);
	Stud stud1=c.getBean("firststudent",Stud.class);
	System.out.println(stud1);
	stud1.study(); 
}
}
