package toolclass.demo;
/*System类是系统中最常用的类，他有三个非常有用的静态成员：out，in，err。
分别表示标准输出流，输入流，错误输出流。
Java System类还定义了一些静态方法，供程序与系统进行交互，currentTimeMillis()方法就是其中之一。
currentTimeMillis()是以毫秒为单位获取计算机的时间的，它返回的值是long型，
记录的是当前时间与1970年1月1日0时之间的时间差。
*/

public class SystemDemo {

	public static void main(String[] args) {
		try {
			//记录程序开始执行时的时间
			long start=System.currentTimeMillis();
			System.out.println("开始执行的时间为:"+start);
			
			Thread.sleep(3000);//让主线程休眠3000毫秒
			
			//记录程序结束执行是的时间
			long end=System.currentTimeMillis();
			System.out.println("结束执行的时间为："+end);
			
			//执行时间=结束时间-开始时间
			System.out.println("共执行了："+(end-start)+"毫秒");
		} 
		catch (InterruptedException el) {
			el.printStackTrace();
		}
	}

}
