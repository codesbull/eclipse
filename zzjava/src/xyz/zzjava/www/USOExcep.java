package xyz.zzjava.www;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class USOExcep {
public static void main(String[] args) {
	String [] listArray=new String[2];
	//使用Arrays.asList()将数组转换成List
	List list=Arrays.asList(listArray);
	List list1=new ArrayList(list);
	//对list进行赋值
	list1.add("Hello");
	listArray[0]="china";
	list.add("world");//抛出操作错误异常
	//输出运行结果
	System.out.println(list.get(0)+","+list.get(1));
}
}
