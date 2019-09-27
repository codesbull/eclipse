package scanner.demo;

import java.util.Scanner;

public class Scannerdemo {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("plese input char(中间能加空格或符号):");
		String a=input.nextLine();
		System.out.println("plese input char(中间不能加空格或符号):");
		String b=input.nextLine();
		System.out.println("plese int：");
		int c=input.nextInt();
		System.out.println("plese input double:");
		double d=input.nextDouble();
		System.out.println("plese input float:");
		float f=input.nextFloat();
		System.out.println("input by order:");
		System.out.println(a+" "+b+" "+c+" "+d+" "+f);
		
	}

}
