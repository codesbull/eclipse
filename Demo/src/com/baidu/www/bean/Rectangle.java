package com.baidu.www.bean;

public class Rectangle extends Graphics {
	private double width;
	private double length;
	
	public Rectangle(String shape, double width, double length) {
		super(shape);
		this.width = width;
		this.length = length;
	}
	
	
	public Rectangle(String shape, double width) {
		super(shape);
		this.width = width;
		this.length = width;
	}


	@Override
	public double area() {
		return this.length*this.width;
	}
	@Override
	public double perimeter() {
		return 2*(this.length*this.width);
	}
	
}
