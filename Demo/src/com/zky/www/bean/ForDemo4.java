package com.zky.www.bean;

public class ForDemo4 {

	public static void main(String[] args) {
		//��ӡ��������
		for(int i=0;i<=12;i++)
		{
			for(int j=0;j<12-i;j++)
				System.out.print(" ");
			
			for(int k=0;k<2*i+1;k++)
				System.out.print("*");
			
			System.out.println();
		}
	}
}
