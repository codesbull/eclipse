package cn.cherish.www.bean;

public class SumDemo {

	public static void main(String[] args) {
		if(args.length==2)//数组大小使用length取出
		{
			int a=Integer.parseInt(args[0]);
			
			int b=Integer.parseInt(args[1]);
			int sum=a+b;
			System.out.println("第一个数是："+a);
			System.out.println("第二个数是："+b);
			System.out.println("两数之和是："+sum);
		}else{
			System.out.println("请输入两整数数值！！");
		}
	}

}
