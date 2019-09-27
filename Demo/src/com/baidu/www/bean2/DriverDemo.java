package com.baidu.www.bean2;

public class DriverDemo {

	public static void main(String[] args) {
		//父类引用指向子类对象
		Car car=new QQ();
		Driver driver=new Driver();
		driver.drive(car);
	}

}
