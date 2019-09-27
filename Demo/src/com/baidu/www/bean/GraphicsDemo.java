package com.baidu.www.bean;

public class GraphicsDemo {

	public static void main(String[] args) {
		Graphics g=new Circle("圆",2.1);
		g.message();
		System.out.println("*********************");
		
		Graphics g2=new Rectangle("矩形",3,4);
		g2.message();
		System.out.println("*********************");
		Graphics g3=new Rectangle("正方形",5);
	    g3.message();
	}

}
