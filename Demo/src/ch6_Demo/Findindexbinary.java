package ch6_Demo;
public class Findindexbinary {
	public static void main(String[] args) {
		int [] array = {4,6,7,8,9,23,55,67,89,99,615};
		//查找55的索引
		int index = findIndexBinary(array, 55);
		System.out.println("索引是："+index);
	}
	public static int findIndexBinary(int [] array,int a){
		int minIndex =0;
		int maxIndex =array.length-1;
		int midIndex =(minIndex+maxIndex)/2;
		while(a!=array[midIndex]){
			if(a>array[midIndex]){
				minIndex=midIndex+1;
			}else{
				maxIndex=midIndex-1;
			}
			midIndex=(midIndex+maxIndex)/2;
		}
		return midIndex;
	}
}
