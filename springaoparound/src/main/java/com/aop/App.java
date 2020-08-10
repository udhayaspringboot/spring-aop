package com.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.service.ShapeService;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args)
	{
		ApplicationContext app = new ClassPathXmlApplicationContext("appCon.xml");
		ShapeService ss = (ShapeService) app.getBean("shapeService"); //or
		//ShapeService sf = app.getBean("circle", ShapeService.class);
		ss.getCircle().setName("Udhay");
		//ss.getCircle().setNameAndReturn("Soorya");
		System.out.println(ss.getCircle().getName());
		
	}
}
