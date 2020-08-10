package com.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.service.FactoryServices;
import com.aop.service.ShapeService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		
    	FactoryServices fs = new FactoryServices();
    ShapeService sfg = (ShapeService) fs.getBean("shapeService");
    	
    	
    	sfg.getCircle();
    	/*
		 * ApplicationContext app = new ClassPathXmlApplicationContext("appCon.xml");
		 * ShapeService ss = (ShapeService) app.getBean("shapeService"); //or
		 * //ShapeService sf = app.getBean("circle", ShapeService.class);
		 * ss.getCircle().setName("Udhay"); //ss.getCircle().setNameAndReturn("Soorya");
		 * System.out.println(ss.getCircle().getName());
		 */
    }
}
