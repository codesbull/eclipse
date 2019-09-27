package toolclass.demo;

import java.util.Calendar;

public class DateAndTime {
	//星期要转换成汉语形式显示，数字1表示星期日
	static final char days[]= {' ','日','一','二','三','四','五','六'};
	
	public static void main(String[] args) {
		Calendar cal=Calendar.getInstance();//获取当前时间，创建对象
		int year=cal.get(Calendar.YEAR);//获取年份
		int month=cal.get(Calendar.MONTH)+1;//它是以0为第一个月所以加1
		int date=cal.get(Calendar.DATE);//获取日期
		
		//获取星期几，它是以1为第一天，要用数组days[]来换算
		int day=cal.get(Calendar.DAY_OF_WEEK);
		int hour=cal.get(Calendar.HOUR_OF_DAY);//获取小时，24小时制
		int min=cal.get(Calendar.MINUTE);//获取分钟
		int sec=cal.get(Calendar.SECOND);//获取秒
		
		//按中国人习惯显示日期和时间
		System.out.println("今天是:"+year+"年"+month+"月"+date+"日   "+"星期"+days[day]);
		System.out.println("现在时间是:"+hour+":"+min+":"+sec);
	}
}
