package cn.cherish.www.bean;

public class IfDemo3 {

	public static void main(String[] args) {
		/* y=x;(x<0)
		 * y=2x+10;(0<=x<10)
		 * y=x*x(x>=10) 
		 */
		double y;
		double x=Double.parseDouble(args[0]);
		
		if(x<0)
		{
			y=x;
			System.out.println("x="+x);
			System.out.println("y=x="+y);
		}else if(x<10)
		{
		   y=2*x+10;
		   System.out.println("x="+x);
		   System.out.println("y=2x+10="+y);
		}else
		{
			y=x*x;
			System.out.println("x="+x);
			System.out.println("y=x*x="+y);
		}
	}
}
