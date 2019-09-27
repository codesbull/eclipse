package com.zky.www.bean;

public class ForDemo3 {

	public static void main(String[] args) {
		//¥Ú”°æ≈æ≈≥À∑®±Ì
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=i;j++)
				//System.out.printf("%d*%d=%-3d",j,i,i*j);
				System.out.print(j+"*"+i+"="+(i*j)+"\t");
			System.out.println();
		}
	}

}
