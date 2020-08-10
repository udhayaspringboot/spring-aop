package com.aop.service;

import com.aop.model.Circle;
import com.aop.model.Triangle;

public class ShapeService {
	
	private Triangle triangle;
	private Circle circle;
	public Triangle getTriangle() {
		return triangle;
	}
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
	public Circle getCircle() {
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
