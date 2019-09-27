package com.baidu.www.array;

public class BubbleSortDemo {

	public static void main(String[] args) {
		int a[]=new int[10];
		BubbleSort.init(a);
		System.out.println("sorted before:");
		
		BubbleSort.showArray(a);
		System.out.println("\nsorted after:");
		
		BubbleSort.arraySorded(a);
		BubbleSort.showArray(a);
	}
}
