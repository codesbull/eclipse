package toolclass.demo;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//Matcher除了可以对字符串进行模式匹配检查外，还可以利用正则表达式对字符串中部分配的类容进行替换
/*在主方法中通过Pattern.compile生成Pattern对象，并且编译一个简单的正则表达式，
然后利用pa.matcher()方法调用Pattern类的matcher()方法生成一个Matcher对象，
最后用Matcher对象的appendReplace()方法将程序中的字符串子串实现替换。*/
public class Java_Raplace {
	public static void main(String[] args) {
		String str="lihua and xiaoming are good fridends!";
		Pattern p=Pattern.compile("good");//生成Pattern对象并且编译一个简单的正则表达式“good”
		Matcher mc=p.matcher(str);//用Pattern类的matcher()方法生成一个Matcher对象
		
		StringBuffer sb=new StringBuffer();
		int count=0;
		boolean result;
		
		while (mc.find()) {
			
			mc.appendReplacement(sb,"excellent");
			count++;
			System.out.println("\n第"+count+"次匹配StringBuffer的类容是：\n");
		}
		mc.appendTail(sb);//最后调用appendTail()方法将最后一次匹配后的剩余字符串加到StringBuffer里
		System.err.println("调用 appendTail 方法后StringBuffer 的最终类容是：\n"+sb.toString());
	}
}
