package demo;

import org.omg.CORBA.PUBLIC_MEMBER;

public class StudentDemo {

	public static void main(String[] args) {
		Student.setDeptName("���̹���ѧԺ");
			//@SuppressWarnings("unused")
			Student s1=new Student();
			//@SuppressWarnings("unused")
			Student s2=new Student();
			
			System.out.println("s1��ϵ����"+Student.getDeptName());
			System.out.println("s2��ϵ����"+Student.getDeptName());
	}

}
