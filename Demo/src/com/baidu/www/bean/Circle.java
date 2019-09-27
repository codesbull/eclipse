package com.baidu.www.bean;

public class Circle extends Graphics {
	private double radius;

	public Circle(String shape, double radius) {
		super(shape);
		this.radius = radius;
	}

	public Circle() {
		super();
	}

	@Override
	public double area() {
		return Math.PI*radius*radius;
	}

	@Override
	public double perimeter() {
		return 2*Math.PI*radius;
	}

	
}
