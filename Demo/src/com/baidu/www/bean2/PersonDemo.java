package com.baidu.www.bean2;

public class PersonDemo {
	public static void main(String[] args) {
		Person p=new Person();
		//p.showMessage();
		System.out.println(p.toString());
		System.out.println("********************");
		
		Student s=new Student("2016001","����",20,true);
		s.showMessage();
		System.out.println("********************");
		
		/*���뿴�����п��ҡ�
		 * ���������û��showMessage�����������
		 * ���������û��showMessage������ø����е�showMessage
		 * ��ˣ�Ҫ��õ���Ҫ�Ľ����Ҫ����������toString��д��override��
		 */
		Person p2=new Student("2016002","����",21,false);
		p2.showMessage();
	}
}

