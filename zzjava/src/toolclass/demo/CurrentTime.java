package toolclass.demo;
/*Calendar类是java.util包下的一个抽象类。
首先实例化一个Date对象，然后使用date.getTime()和date.toGMTString()方法
分别获取相对时间和当前时间*/
import java.util.Date;
public class CurrentTime {
	public static void main(String[] args) {
		Date date=new Date();//实例化date对象
		System.out.println("距1970年1月1日00：00：00时间已经过了"+date.getTime()+"毫秒");//调用Date类的getTime()方法
		System.out.println("当前时间："+date.toGMTString());//调用Date类的toGMTString()方法，此方法已过时
	}
}
