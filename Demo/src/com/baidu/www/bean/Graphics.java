package com.baidu.www.bean;

public abstract class Graphics {//抽象类不能直接生成对象
	//类中有抽象方法，必为抽象类
	protected String shape;//实例变量
	public abstract double area();//方法的声明
	public abstract double perimeter();
	
	public String getShape() {//get 方法
		return shape;
	}
	public void setShape(String shape) {//set 方法
		this.shape = shape;
	}
	public Graphics(String shape) {//有参构造
		super();
		this.shape = shape;
	}
	public Graphics() {//无参构造
		super();
	}
	
	public void message()
	{
		System.out.println(this.shape+"的面积是："+this.area());
		System.out.println(this.shape+"的周长是："+this.perimeter());
	}
	
	
}
