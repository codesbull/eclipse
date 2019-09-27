package cn.cherish.www.bean;

public class IntegerDemo1 {

	public static void main(String[] args) {
		byte b=127;
		short s=3276;
		int a=12;
		long l=1;
		//类型自动转换：byte和short类型相加，结果是int类型
		int aa=b+s;
		long bb=a+1;
		System.out.println("byte类型最大值："+Byte.MAX_VALUE);
		System.out.println("short类型最大值："+Short.MAX_VALUE);
		System.out.println("int类型最大值："+Integer.MAX_VALUE);
		System.out.println("long类型最大值："+Long.MAX_VALUE);
		/**整型：byte(Byte)，short（Short），int（Integer），long（Long）
		 * 在jdk1.5后，基本类型和包装类（wrapper class）之间自动的拆箱和封箱
		 */
		int ab=3;
		//Integer ac=3  与  Integer ac=new Integer(3); 两者相同
		//int grade=Integer.parseInt(args[0]);//取出参数，转换为整型
		Integer ac=3;
		int ad=ab+ac;
		System.out.println("ad="+ad);
	}

}
