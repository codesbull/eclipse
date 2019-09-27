/*
 * 数组求解Fibonacci数列的前20项
 */
package ch6_Demo;
public class ch6_2 {
	public static void main(String[] args) 
	{
		int i;
		int[] f=new int[20];
		f[0]=1;f[1]=1;
		
		for(i=2;i<20;i++)
			f[i]=f[i-1]+f[i-2];
			
		for(i=0;i<20;i++){
			if(i%5==0) System.out.println("\n");
			System.out.print("\t"+f[i]);
			}
	}
}

