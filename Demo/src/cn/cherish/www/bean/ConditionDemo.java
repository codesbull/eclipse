package cn.cherish.www.bean;
public class ConditionDemo {
	public static void main(String[] args) {
		int a=5,b=3;
		int max=a>b?a:b;
		System.out.println("max="+max);
		int min=a<b?a:b;
		System.out.println("min="+min);
		System.out.println("***************************");
		int c=3;
		c+=2;//-->c=c+2;
		System.out.println("c="+c);
		int i=5;
		int j=i++;//先赋值，再加1，j=i=5，i=6
		System.out.println("***************************");
		System.out.println("i="+i);
		System.out.println("j="+j);
		System.out.println("***************************");
		int i2=5;
		int j2=++i2;//先加1，再赋值，i2=6，j2=6
		System.out.println("i2="+i2);
		System.out.println("j2="+j2);
		//无论是i++或++i，其值都是加1;j=i++,先赋值后加1（加1）
		
	}

}
