package xyz.zzjava.www;

/*数组元素类型不匹配异常是一种将错误类型的对象存储到一个对象数组时抛出的异常。
在该类的主方法中试图将int类型的数组元素赋值给声明为Object类型的obj数组。*/
public class ArrayStoreExcep {
	public static void main(String[] args) {
		//创建数组类型为Object类型的数组
		Object obj[]=new String[5];
		for(int i=0;i<obj.length;i++) {
			//将int类型的数组元素赋值给obj数组
			obj[i] =new Integer(i);
			System.out.println(" "+obj[i]);
		}
	}
}
