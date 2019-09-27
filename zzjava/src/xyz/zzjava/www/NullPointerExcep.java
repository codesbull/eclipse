package xyz.zzjava.www;
/*所谓空指针异常，就是调用了不存在的对象，或者是没有初始化的对象所引发的异常。
如果在程序中使用了一个被设为null对象时，就会引发该异常。*/
public class NullPointerExcep {
	//创建一个被设为null对象test
	static Test test;
public static void main(String[] args) {
	//使用test调用talk()方法
	System.out.println(test.talk());
}
}
class Test{
	public String talk() {//创建一个被调用方法
		return "this is a boy";
	}
}
