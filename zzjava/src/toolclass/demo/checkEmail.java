package toolclass.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class checkEmail {
	public static void main(String[] args) {
		String str="lester:123@sina.cn";
		Pattern p=Pattern.compile("^\\.|^\\@");//检测输入的Email地址是否以非法字符号“.”或“@”作为起始字符
		Matcher m=p.matcher(str);
		if (m.find()) {
			System.err.println("Email地址不能以'.'或'@'作为起始字符");
		}
		
		p=Pattern.compile("^www\\.");//检查是否以‘www.’起始
		m=p.matcher(str);
		if (m.find()) {
			System.out.println("Emil地址不能以www.开始");
		}
		p=Pattern.compile("[^A-Za-z0-9\\.\\@_\\-~#]+");//检查是否包含非法字符
		m=p.matcher(str);
		StringBuffer sb=new StringBuffer();
		boolean result=m.find();
		boolean deletedIllegalChars=false;
		
		while (result) {
			deletedIllegalChars=true;//如果有非法字符就设下标记
			m.appendReplacement(sb, "");//如果里面有非法字符，就把它们弄去，加入SB里
			result=m.find();
		}
			m.appendTail(sb);
			String strl=sb.toString();
			
			if (deletedIllegalChars) {
				System.out.println("输入的Emil地址里有：, 等非法字符,请修改");
				System.out.println("您的输入为："+str);
				System.out.println("修改后合法的地址应类似："+strl);
			}
		}
	}

