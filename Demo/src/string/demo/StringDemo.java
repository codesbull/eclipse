package string.demo;

public class StringDemo {

	public static void main(String[] args) {
		String str1="abc";
		String str2="abc";
		String str3=new String("abc");
		String str4=new String("abc");
		//".equals()"�Ƚϵ���2����������ݣ������Բ������ַ���a�����ַ���b�����ǵ�ֵû��
		//"=="�Ƚϵ���2������ĵ�ַ
		System.out.println("str1==str2:"+(str1==str2));
		System.out.println("str1.equals(str2):"+str1.equals(str2));
		System.out.println("str1==str3:"+(str1==str3));
		System.out.println("str1.equals(str3):"+str1.equals(str3));
		System.out.println("str3.equals(str4):"+str3.equals(str4));
	}
}
