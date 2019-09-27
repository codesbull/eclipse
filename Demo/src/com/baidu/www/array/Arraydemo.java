
package com.baidu.www.array;
import java.util.Scanner;
public class Arraydemo {

	public static void main(String[] args) {
		int n=0;
		do{//try{} catch(){}是一对。一个try可以有多个catch
			try{System.out.println("plese input number(3~15):");
			Scanner sc=new Scanner(System.in);
			n=sc.nextInt();
			}catch(Exception e){
				System.out.println("输入的不是数字，请输入数值！");
			}
		}while(n<3 || n>15);
		int a[][]=new int[n][n];
		int m=1;
		for(int k=0;k<(n+1)/2;k++){//行数
			for(int i=k;i<a.length-k;i++)
				a[i][k]=m++;//列
			for(int j=k+1;j<a.length-k;j++)
				a[a.length-1-k][j]=m++;//行
			for(int i=a.length-1-1-k;i>=k;i--)
				a[i][a.length-1-k]=m++;//列
			for(int j=a.length-1-1-k;j>k;j--)
				a[k][j]=m++;//行
		}
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++)
				System.out.printf("%-4d",a[i][j]);
			System.out.println();
		}
	}
}
