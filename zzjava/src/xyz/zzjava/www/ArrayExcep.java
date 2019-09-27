package xyz.zzjava.www;
/*数组下标越界异常即 ArrayIndexOutOfBoundsException
当访问的数组元素的下标值大于数组的最大下标值时发生
也就是说数组元素的下标值大于等于数组的长度时发生
*/
public class ArrayExcep {
	public static void main(String[] args) {
		int a[]=new int[5];//声明一个大小为5的数组
		for(int i=0;i<10;i++) {//建立从0~9的for循环赋值
			a[i]=i+1;
			System.out.print(" "+a[i]);//打印输出结果
		}
	}
}
