package cn.cherish.www.bean;

public class ShortDemo {
		public static void main(String[] args) {
			System.out.println("max of short:"+Short.MAX_VALUE);
			System.out.println("min of short:"+Short.MIN_VALUE);
			
			byte a=12;
			short b=13;
			int  c=a+b;//在进行数学运算时，默认转换为整型
			System.out.println("a="+a);//+字符串连接符
			System.out.println("b="+b);
			System.out.println("c="+(a+b));
            System.out.println("c="+a+b);//+字符串连接符
	}

}
