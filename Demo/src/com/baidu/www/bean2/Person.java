package com.baidu.www.bean2;

public class Person {
	/* �Զ����Ա����
	 * protected ���ĺ���������������������εĳ�Ա�������Ĳ�����
	 * protected���������༰ͬһ����������Է���
	 */
	protected String personName;
	protected int personAge;
	protected boolean personSex;
	
	public Person(String personName,int personAge,boolean personSex)
	{//���췽����������
		super();
		this.personName=personName;
		this.personAge=personAge;
		this.personSex=personSex;
	}
	public Person()
	{
		this("����",21,true);
	}
		
		//set,get ����
		public void setPersonName(String personName)
		{
			this.personName=personName;
		}
		public String getPersonName()
		{
			return this.personName;
		}
		
		public void setPersonAge(int personAge)
		{
			this.personAge=personAge;
		}
		public int getpersonAge()
		{
			return this.personAge;
		}
		
		public void setPersonSex(boolean personSex)
		{
			this.personSex=personSex;
		}
		public boolean isPersonSex()
		{
			return this.personSex;
		}
		
		
		public void showMessage()
		{
			System.out.println("person of name:"+this.personName);
			System.out.println("person of age:"+this.personAge);
			System.out.println("person of sex:"+(this.personSex?'男':'Ů'));
		}
		
		@Override //��д������
		public String toString() {
			return "Person [personName=" + personName + ", personAge=" + personAge + ", personSex=" + personSex + "]";
		}
		
		
		
		
}
