package com.baidu.www.bean3;

public class Rectangle implements Graphics {
	
	private String shape;
	private double width;
	private double length;
	
	public Rectangle(String shape, double width, double length) {
		super();
		this.shape = shape;
		this.width = width;
		this.length = length;
	}

	@Override
	public double area() {
		return this.width*this.length;
	}

	@Override
	public double perimeter() {
		return 2*(this.length+this.width);
	}

	@Override
	public void message() {
		System.out.println(this.shape+"的面积是："+this.area());
		System.out.println(this.shape+"的周长是："+this.perimeter());
	}

}
