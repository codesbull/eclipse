package cn.cherish.www.bean;
public class OperatorDemo {
	public static void main(String[] args) {
		byte a=12;
		int b=13;
		//从高到低自动转换
		int c=a+b;
		System.out.println("c="+c);
		long d=15;
		long e=d+a;
		System.out.println("e="+e);
		//默认的是double类型
		float f=13.5F;
	    float g=f+b;
	    System.out.println("g="+g);
		double h=2.999;
		//double类型强制转换成int，除去小数部分
		int i=(int)(a+h);
		System.out.println("i="+i);
		//自动转换，0.0是无限接近于0的数
		double j=b/0.0;
		System.out.println("j="+j);
		//整数求余数
		int k=b%4;
		System.out.println("k="+k);
	}

}
