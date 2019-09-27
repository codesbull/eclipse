package com.zky.www.bean;

public class ForDemo5 {

	public static void main(String[] args) {
		for(int i=0;i<=12;i++)
		{
			for(int j=0;j<12-i;j++)
				System.out.print(" ");
			for(int k='M'-i;k<='M';k++)
			  System.out.print((char)k);	
			System.out.print("$");
	
		
			for(int k='N';k<='N'+i;k++)
				  System.out.print((char)k);
			
		    System.out.println();
		}
	}

}
