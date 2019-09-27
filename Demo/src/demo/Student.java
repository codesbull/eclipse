package demo;

import java.util.Date;

public class Student {
	//成员变量 
	private String sno;
	private String sname;
	private Date sbirthday;
	private boolean ssex;
	//类变量，静态变量
	private static String deptName;
	/*静态变量和实例变量的区别
	 * 1.静态变量由类直接调用，实例变量是由对象的引用来调用（即生成对象后调用）
	 * 2.静态变量是类被加载时，一同被加载。和生成的对象没有直接关系。
	 */
	//无参构造方法
	public Student(){
		super();
	}
	//能传参的构造方法
	public Student(String sno, String sname, Date sbirthday, boolean ssex) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.sbirthday = sbirthday;
		this.ssex = ssex;
	}
	//实例方法，成员方法
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Date getSbirthday() {
		return sbirthday;
	}
	public void setSbirthday(Date sbirthday) {
		this.sbirthday = sbirthday;
	}
	public boolean isSsex() {
		return ssex;
	}
	public void setSsex(boolean ssex) {
		this.ssex = ssex;
	}
	//类方法，静态方法
	public static String getDeptName() {
		return deptName;
	}
	public static void setDeptName(String deptName) {
		Student.deptName = deptName;
	}

	
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", sbirthday=" + sbirthday + ", ssex=" + ssex + "]";
	}
	
	
	
	
	
	

}
