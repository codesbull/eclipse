package xyz.zzjava.www;

public class SIOOBExcep {
	public static void main(String[] args) {
		//��ʼ���ַ�������
		String str="This is a StringIndexOutbounds";
		//ʹ��charAt()�����趨�ַ�������
		char ch=str.charAt(30);
		System.out.println(ch);
	}
}
