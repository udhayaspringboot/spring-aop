package com.aop.service;

import com.aop.model.Circle;
import com.aop.model.Triangle;

public class FactoryServices {
	public Object getBean(String beanType)
	{
		if(beanType.equals("shapeService"))
		{
			return new ShapeService();
		}
		if(beanType.equals("Circle"))
		{
			return new Circle();
		}
		if(beanType.equals("Triangle"))
		{
			return new Triangle();
		}
		return beanType;
		
	}

}
