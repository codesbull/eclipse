package toolclass.demo;

import java.util.Formatter;

/*Formatter类比print()类方法功能更强，
不仅可以用于控制台的输出，还可以用于GUI窗口程序的输出，
本例是Formatter类的格式化输出的一个简单实例*/
public class FormatterUsage {
	public static void main(String[] args) {
		Object[] ob=new Object[2];//创建Object数组
		ob[0]=Integer.valueOf(51);//给数组赋值
		ob[1]=Integer.valueOf(1293);
		Formatter fmt=null;
		
		System.out.println("第一种输出方式：");
		fmt=new Formatter();//以默认存储区为目标，创建对象
		Object[] ob1=new Object[2];
		ob1[0]=Double.valueOf(1112.12675456);
		ob1[1]=Double.valueOf(0.1258989);
		//格式化输出数据，输出到自己的存储区
		fmt.format("输出到自带存储区，每个输出项占8个字符位：%4.4f %5.2f\n", ob1);
		System.out.print(fmt);//再从对象的存储区中输出到屏幕
		
		System.out.println("\n第二种输出方式：");
		fmt=new Formatter(System.out);//以标准输出设备为目标，创建对象
		//格式化输出数据，并输出到标准输出设备
		fmt.format("直接输出，每个输出项占5位字符位：%5d%5d\n\n", ob);
		
		System.out.println("第三种输出方式：");
		StringBuffer buf=new StringBuffer();
		fmt=new Formatter(buf);//以指定字符串为目标，创建对象
		//格式化输出数据，输出到buf中
		fmt.format("输出到指定的缓冲区，每个输出项占8个字符位：%8d%8d\n\n", ob);
		System.out.print(buf);//再从buf中输出到屏幕
	}
}
