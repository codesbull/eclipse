package xyz.zzjava.www;

public class SIOOBExcep {
	public static void main(String[] args) {
		//初始化字符串变量
		String str="This is a StringIndexOutbounds";
		//使用charAt()方法设定字符串长度
		char ch=str.charAt(30);
		System.out.println(ch);
	}
}
