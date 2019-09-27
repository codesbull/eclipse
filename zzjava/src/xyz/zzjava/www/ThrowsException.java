package xyz.zzjava.www;
public class ThrowsException {
public static void main(String[] args) {
	try {//由于ShowException会抛出异常，所以编译器会强制程序员再此捕获异常
		ShowException();
	}catch(Exception e) {//使用catch语句捕获该异常
		System.out.println("这只是在ShowException中声明\n"+"并在main方法中捕获的异常：\n" +e);
	}
	}
public static void ShowException() throws Exception{
	//在这里声明要抛出的异常
	Object x=new Integer(0);
	System.out.println((String) x);
}
}
