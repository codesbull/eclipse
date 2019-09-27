package com.baidu.www.bean3;
public class Circle implements Graphics {//implement ʵ��
	//Circle�� ��ʵ����Graphics�ӿ�
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
		System.out.println(this.shape+"������ǣ�"+this.area());
		System.out.println(this.shape+"���ܳ��ǣ�"+this.perimeter());
	}

}
