package com.aop.service;

import com.aop.aspects.loggable;
import com.aop.model.Circle;
import com.aop.model.Triangle;

public class ShapeService {
	
	private Triangle triangle;
	@loggable
	private Circle circle;
	public Triangle getTriangle() {
		return triangle;
	}
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
	public Circle getCircle() {
		System.out.println("circle is running");
		return circle;
	}
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	public ShapeService(Triangle triangle, Circle circle) {
		super();
		this.triangle = triangle;
		this.circle = circle;
	}
	public ShapeService() {
		super();
	}
 
}
