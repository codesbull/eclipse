package xyz.zzjava.www;
/*在该类的住方法中使用try-catch-finally捕获数组元素不匹配异常，
并增加finally语句输出一串字符串*/
public class TryCatchFinally {
public static void hasException() {
	Object obj[]=new String[4];//窜构建一个字符串数组
	for(int i=0;i<obj.length;i++) {
		try {
			if(i%2==1)
				obj[i]=new Integer(i);//此句会发生ArrayStoreException异常
			else
				obj[i]=new Integer(i)+"";
			System.out.println(" "+obj[i]+"\n");
		}catch(ArrayStoreException e) {//捕获该异常
			System.out.println("出现ArrayStoreException异常，数组内元素类型与数组类型不匹配");
		}finally {//执行finally语句
			System.out.println("这是finally块，是程序必须执行的部分\n");
		}
	}
	System.out.println("方法执行结束");
}
public static void main(String[] args) {
	hasException();
	System.out.println("程序正常结束");
}
}
