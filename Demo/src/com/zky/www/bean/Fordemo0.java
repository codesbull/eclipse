package com.zky.www.bean;

public class Fordemo0 {

	public static void main(String[] args) {
		for(int i=0;i<6;i++){
			for(int j=0;j<5-i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}