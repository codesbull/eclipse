/*
 * ð������
 */
package com.baidu.www.array;
public class BubbleSort {
	
	public static void init(int b[]){
		for(int i=0;i<b.length;i++){
			b[i]=(int)(Math.random()*100);//���ȡ����0~100����
		}
	}
	public static void showArray(int b[]){
		for(int i=0;i<b.length;i++){
			System.out.print(b[i]+" ");//��ӡ�ո�
		}
	}
	public static void arraySorded(int [] b){//����������
		for(int i=0;i<b.length-1;i++){
			for(int j=0;j<b.length-1-i;j++)
				if(b[j]>b[j+1])
				{
					int temp=b[j];
					b[j]=b[j+1];
					b[j+1]=temp;
				}
		}
	}
}
