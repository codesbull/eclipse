package toolclass.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//在初始字符串中查找与12小时表示法相匹配的子串，并将其替换为24小时表示法，同时显示替换的过程，最后显示替换后的结果。
/*正则表达式匹配方法的应用。
JDK1.4开始，java提供了一个java.util.regex包，该包用于正则表达式对字符进行匹配，
它共包括两个类：Patter类和Matcher类。
本例的功能为使用正则表达式将文本中“00：00（a/p）m”格式的时间修改为24小时制式的时间，修改后将结果输出
java的标准类库中提供了一个java.util.regex.Pattern类，其对象表示通过编译的正则式，利用该类对象可以与任意字符串进行模式匹配
需要注意的是，Pattern类的构造器是private的，因此不能通过调用构造器创建对象，而需要调用Pattern类通过的静态工厂方法来获得对象
*/
public class RegexExample {
	public static void main(String[] args) {
		
		//定义正则表达式与被匹配的字符串
		String patternStr="(0?[1-9]|1[0-2]):([0-5]\\d)([a|p]m)";
		
		String matcherStr="现在的时刻为10:51pm,这里的营业时间为每天8:00am至5:30pm!!!";
		
		Pattern p=Pattern.compile(patternStr);//生成Pattern对象与Matcher对象
		Matcher m=p.matcher(matcherStr);
		
		StringBuffer sb=new StringBuffer();//创建目标字符缓冲区
		int count=0;
		System.out.println("初始字符串为：");//打印初始字符串
		System.out.println("matcherStr");
		
		while (m.find()) {
			StringBuffer temp =new StringBuffer();//创建临时字符缓冲区
			if (m.group(3).equals("am")) {//时间为am的情况的替换工作
				temp.append(m.group(1));//设置新的时间格式
				temp.append(":");
				temp.append(m.group(2));
			} else {//时间为pm的情况替换工作
				int time=Integer.parseInt(m.group(1));//提取时间并转换
				time=time+12;
				temp.append(time+":"+m.group(2));//设置新的时间格式
			}
			//进行替换并将结果放入目标字符串缓冲区
			m.appendReplacement(sb, temp.toString());
			//打印每次替换情况
			System.out.println("["+(++count)+"] 将" +m.group(0)+"替换为"+temp.toString());
		}
		m.appendTail(sb);//将最后一次替换后剩余的字符串添加进目标字符串缓冲区
		System.out.print("最后结果为：");//打印最后结果
		System.out.println(sb.toString());
	}
}
