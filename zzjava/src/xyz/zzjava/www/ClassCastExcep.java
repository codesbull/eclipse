package xyz.zzjava.www;
/*当程序运行时，有时需要对不同的类型进行类型转换。
在做类型转换时，当Java虚拟机发现这两个类型不兼容而无法完成转换时会出现ClassCastException异常*/
public class ClassCastExcep {

	public static void main(String[] args) {
		//创建一个Integer类型的对象
		Object x=new Integer(0);
		//将x转换为一个String类型的变量
		System.out.println((String)x);
	}
}
