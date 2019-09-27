package demo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	
	public static void main(String[] args) {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String date=sdf.format(new Date());
		System.out.println(date);
		
		
		
		
	}

}
