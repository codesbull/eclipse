package demo;

import org.omg.CORBA.PUBLIC_MEMBER;

public class StudentDemo {

	public static void main(String[] args) {
		Student.setDeptName("工商管理学院");
			//@SuppressWarnings("unused")
			Student s1=new Student();
			//@SuppressWarnings("unused")
			Student s2=new Student();
			
			System.out.println("s1的系部："+Student.getDeptName());
			System.out.println("s2的系部："+Student.getDeptName());
	}

}
