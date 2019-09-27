package xyz.zzjava.www;
public class TryCatch {
public static void main(String[] args) {
	//建立一个数组模型
	int array[]= {0,1,2,3,4,5,6};
	try {
		//对数组循环赋值
		for(int i=0;i<10;i++) {
			System.out.println("array["+i+"]="+array[i]);
		}
	}catch(ArrayIndexOutOfBoundsException e) {//使用catch语句捕获异常
		System.out.println("array[]的长度是"+array.length+",数组下标越界了");
	}
	System.out.println("运行结束");}
}
