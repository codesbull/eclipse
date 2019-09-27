package string.demo;

public class StringDemo {

	public static void main(String[] args) {
		String str1="abc";
		String str2="abc";
		String str3=new String("abc");
		String str4=new String("abc");
		//".equals()"比较的是2个对象的内容，很明显不管是字符串a还是字符串b，他们的值没变
		//"=="比较的是2个对象的地址
		System.out.println("str1==str2:"+(str1==str2));
		System.out.println("str1.equals(str2):"+str1.equals(str2));
		System.out.println("str1==str3:"+(str1==str3));
		System.out.println("str1.equals(str3):"+str1.equals(str3));
		System.out.println("str3.equals(str4):"+str3.equals(str4));
	}
}
