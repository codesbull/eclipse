package com.zky.www.bean;

public class WhileDemo {

	public static void main(String[] args) {
		//1+3+5+...+99
		int i=1;
		int sum=0;
		while(i<=99){
			sum+=i;
			i=i+2;
		}
		System.out.println("sum="+sum);
	}

}
