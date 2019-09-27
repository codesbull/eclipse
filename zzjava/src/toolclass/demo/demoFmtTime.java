package toolclass.demo;

import java.util.Date;
import java.util.Formatter;

/*使用Formatter类的format()方法可以完成时间和日期的转换
 *在该类的主方法中首先获取当前时间，然后通过格式转换符以各种格式输出日期和时间 
 *要输出日期和时间，需要以''%"为前缀，后面加上任意字符组成完整地格式转换符，输出项必须是Date及其子类对象
 * */
public class demoFmtTime {
	public static void main(String[] args) {
		
		//以标准输出设备为目标，创建对象
		Formatter fmt=new Formatter(System.out);
		//获取当前时间
		Date dt=new Date();
		
		//以各种形式输出日期和时间
		fmt.format("现在的日期和时间(以默认的完整格式): %tc\n",dt);
		fmt.format("今天的日期(按中国习惯)：%1$tY-%1$tm-%1$td\n", dt);
		fmt.format("今天是：%tA\n", dt);
		fmt.format("现在的时间（24小时制）：%tT\n", dt);
		fmt.format("现在的时间（12小时制）：%tr\n", dt);
		fmt.format("现在是：%tH点%1$tM分%1$tS秒", dt);
	}
}
