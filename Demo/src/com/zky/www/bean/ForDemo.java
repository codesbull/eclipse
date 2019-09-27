package com.zky.www.bean;

public class ForDemo {

	public static void main(String[] args) {
		//1*1+2*2+...+10*10
		int sum=0;
		for(int i=1;i<=10;i++)
			sum+=i*i;//sum=sum+i*i
		System.out.println("sum="+sum);
	}

}
