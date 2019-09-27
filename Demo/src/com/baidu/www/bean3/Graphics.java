package com.baidu.www.bean3;

public interface Graphics {//规范标准 面向接口（抽象）的编程
	//接口是抽象类的抽象   常量和抽象方法
	public static final double PI=3.14;//常量 所有字母大写
	double area();//public abstract  抽象方法
	double perimeter();
	void message();
}
