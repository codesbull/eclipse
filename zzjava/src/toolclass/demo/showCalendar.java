package toolclass.demo;
import java.util.*;
/*使用GregorianCalendar类输出日历
GregorianCalendar是一个公历实现类。它是Calendar类的派生类。
相对于Canlendar，它多定义了两个属性AD和BC，分别表示公元前和公元后。*/
public class showCalendar {
	static final String head[]= {"星期日  ","星期一  ","星期二  ","星期三  ","星期四  ","星期五  ","星期六  "};
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int i;
		System.out.print("请输入年份:");
		int year=in.nextInt();
		System.out.print("请输入月份:");
		int month=in.nextInt()-1;//GregorianCalendar的第一个月是0和人的理解不同
		in.close();
		
		GregorianCalendar cal=new GregorianCalendar(year,month,1);//以指定的年，月，该月的第一天来创建对象
		int totalDays=cal.getActualMaximum(Calendar.DAY_OF_MONTH);//获取这个月天数
		int startDay=cal.get(Calendar.DAY_OF_WEEK)-1;//获取这个月的第一天是星期几
		
		//输出日历头部，每一输出项占8个字符
		for(i = 0; i< head.length;i++) 
			System.out.print(head[i]+"   ");
			System.out.println();
			
			for(i= 0; i< startDay; i++) //输出第一天之前的空格
				System.out.print("      ");
				
				for (int day= 1; day <= totalDays; day++) {//依次输入每一天，每一个输出项占8个字符宽度
					System.out.printf("  %2d  ",day);
					i++;
					if (i==7) {//每个星期输出完，换行
						System.out.println();
						i=0;
					}
				}
			}
		}

