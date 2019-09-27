package com.baidu.www.bean2;

public class Student extends Person {
	//Student ���࣬Person���࣬extends ��չ����
	private String sno;
	public Student(String sno,String personName,int personAge,boolean personSex)
	
	/* �ڴ����������ʱ��ͬʱ����ø���ǿղ����Ĺ��캯��
	 * ��ô�͵��ڵ�һ�м���super(��������)
	 */
	{
		super(personName,personAge,personSex);////���ø���ָ�����������Ĺ��캯��
		this.sno=sno;
	}
	/* ���ø���ղ������췽��
	 * super�������ӣ�ϵͳ���Զ�����
	 * super�������ã����ø���ղ�������
	 * ��ʼ�����࣬��ʼ���˸��࣬�������ͨ�����������������ø�������Ժͷ���
	 * �����super������
	 */
	public Student()
	{
		super();
	}
	//set get����
	public void setSno(String sno)
	{
		this.sno=sno;
	}
	public String getSno()
	{
		return this.sno;
	}
	
	//�ڸ���������У������ײ���ͬ�������岻ͬʱ���з����ĸ��ǻ���д��override��
	public void showMessage()
	{
		System.out.println("student of number:"+this.sno);
		System.out.println("student of age��"+this.personAge);
		System.out.println("student of name:"+this.personName);
		System.out.println("student of sex:"+(this.personSex?'男':'Ů'));
	}
}
