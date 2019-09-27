package com.baidu.www.bean3;
public class Circle implements Graphics {//implement 实现
	//Circle类 ，实现了Graphics接口
	private String shape;
	private double radius;
	
	public Circle(String shape, double radius) {
		super();
		this.shape = shape;
		this.radius = radius;
	}

	@Override
	public double area() {
		return PI*radius*radius;
	}

	@Override
	public double perimeter() {
		return 2*PI*radius;
	}

	@Override
	public void message() {
		System.out.println(this.shape+"的面积是："+this.area());
		System.out.println(this.shape+"的周长是："+this.perimeter());
	}

}
