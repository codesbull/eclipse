package com.baidu.www.bean2;

public class PersonDemo {
	public static void main(String[] args) {
		Person p=new Person();
		//p.showMessage();
		System.out.println(p.toString());
		System.out.println("********************");
		
		Student s=new Student("2016001","李四",20,true);
		s.showMessage();
		System.out.println("********************");
		
		/*编译看左，运行看右。
		 * 如果父类中没有showMessage，则会编译出错。
		 * 如果子类中没有showMessage，会调用父类中的showMessage
		 * 因此，要想得到想要的结果，要在子类中用toString重写（override）
		 */
		Person p2=new Student("2016002","王五",21,false);
		p2.showMessage();
	}
}

