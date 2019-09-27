package xyz.zzjava.www;
/*在该类的主方法中使用嵌套try-catch-finally捕获数组越界和算数异常*/
public class NestTryCatch {
public static void main(String[] args) {
	//建立一个长度为5的整型数组
	int array[]=new int[5];
	int n=0;
	//使用for循环进行赋值
	for(int i=0;i<array.length;i++) {
		array[i]=i;
	}
	//该循环可能会出现数组索引越界异常
	for(int i=0;i<10;i++) {
		try {
			try {
				//这里可能会出现除0异常
				n=array[i]/(i-1);
			}catch(ArithmeticException e){
				//捕获算数异常
				System.out.println("0不能做被除数");
			}
			System.out.println(n);
		}catch(IndexOutOfBoundsException e){
			//捕获数组索引越界异常
			System.out.println("数组越界异常");
		}
	}
}
}
