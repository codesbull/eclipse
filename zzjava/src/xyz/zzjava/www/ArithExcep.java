package xyz.zzjava.www;
/*算数异常
 * 是指整数被0除所产生的异常。Java中，如果一个整数被0除，那么将抛出ArithmeticException异常。
 * 但是浮点数被0除，将不引发算数异常。
 */
public class ArithExcep {
	public static void main(String[] args) {
		double a=1.0;
		System.out.println(a/0);
		for(int i=10;i>0;i--){//0~10循环
			System.out.print(" "+(i/(i-1)));
			if (i%5==0) {//输出可以被5整除的数
				System.out.println();
			}
		}
	}
}
