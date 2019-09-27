package ch5_Demo;

 public class A4 {
	 int x=0;int y=1;
	 public void Printme() 
	 {
		 System.out.println("x="+x+"y="+y);
		 System.out.println("I'm an"+this.getClass().getName());
		 /*用this来访问当前对象的成员方法 
		  * 通过this表示当前对象，来打印当前对象的类名
		  * getClass（） getName（）是系统类库中提供的方法
		  */
	 }
}
