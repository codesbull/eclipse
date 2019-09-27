package cn.cherish.www.bean;

public class IntegerDemo {

	public static void main(String[] args) {
		
		  int a=5;
		  Integer b=15;
		  Integer c=a+b;
		  String s=b.toString();
		  System.out.println("a="+a);
		  System.out.println("b="+b);
		  System.out.println("c="+c);
		  System.out.println(s+a);
		  System.out.println("b的16进制："+Integer.toHexString(b));
		  System.out.println("b的8进制："+Integer.toOctalString(b));
		  System.out.println("b的2进制："+Integer.toBinaryString(b));
		  System.out.println(s);
		 

	}

}
