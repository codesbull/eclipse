package xyz.zzjava.www;
//递归求阶乘
public class DiGui {
public static void main(String[] args) {
		int result=fn(5);
		System.out.println(result);
}
/**
 * 5!=5*4*3*2*1
 * 4!=4*3*2*1
 * 3!=3*2*1
 * 2!=2*1
 * 1!=1
 */
  public static int fn(int num) {
	  int result=1;
	  if (num>1) 
		result =num*fn(num-1);
	  return result; 
  } 
}