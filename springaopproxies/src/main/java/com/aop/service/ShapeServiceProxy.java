package com.aop.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.aop.aspects.LoggingAspects;
import com.aop.model.Circle;

public class ShapeServiceProxy extends ShapeService {

	public Circle getCircle() {
		LoggingAspects lasd =
		new LoggingAspects();
		lasd.loggingAdvice();
		return super.getCircle();
	}
}
