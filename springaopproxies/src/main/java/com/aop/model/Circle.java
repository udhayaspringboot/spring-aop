package com.aop.model;

public class Circle {
	
	private String name;

	public Circle(String name) {
		
		this.name = name;
	}

	public String getName() {
		return name;
		
		
	}

	public void setName(String name) {
		this.name = name;
		
		
	}
	public String setNameAndReturn(String name) {
		this.name = name;
		
		return name;
	}

	public Circle() {
		super();
	}
	

}
