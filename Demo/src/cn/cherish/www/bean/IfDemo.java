package cn.cherish.www.bean;

public class IfDemo {

	public static void main(String[] args) {
		 String  stra=args[0];//取出args数组的第一个值
		  int a=Integer.parseInt(stra);//把stra字符串转换成整型数据
		  
		  if(a>=18)
		  {
			System.out.println("你已经是成年人了！");  
		  }else
		  {
			  System.out.println("你还没有成年，不能打游戏！");
		  }
	}

}
