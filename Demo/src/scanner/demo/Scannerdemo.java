package scanner.demo;

import java.util.Scanner;

public class Scannerdemo {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("plese input char(�м��ܼӿո�����):");
		String a=input.nextLine();
		System.out.println("plese input char(�м䲻�ܼӿո�����):");
		String b=input.nextLine();
		System.out.println("plese int��");
		int c=input.nextInt();
		System.out.println("plese input double:");
		double d=input.nextDouble();
		System.out.println("plese input float:");
		float f=input.nextFloat();
		System.out.println("input by order:");
		System.out.println(a+" "+b+" "+c+" "+d+" "+f);
		
	}

}
