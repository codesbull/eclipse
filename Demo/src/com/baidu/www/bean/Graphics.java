package com.baidu.www.bean;

public abstract class Graphics {//�����಻��ֱ�����ɶ���
	//�����г��󷽷�����Ϊ������
	protected String shape;//ʵ������
	public abstract double area();//����������
	public abstract double perimeter();
	
	public String getShape() {//get ����
		return shape;
	}
	public void setShape(String shape) {//set ����
		this.shape = shape;
	}
	public Graphics(String shape) {//�вι���
		super();
		this.shape = shape;
	}
	public Graphics() {//�޲ι���
		super();
	}
	
	public void message()
	{
		System.out.println(this.shape+"������ǣ�"+this.area());
		System.out.println(this.shape+"���ܳ��ǣ�"+this.perimeter());
	}
	
	
}
