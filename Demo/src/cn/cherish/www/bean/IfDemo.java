package cn.cherish.www.bean;

public class IfDemo {

	public static void main(String[] args) {
		 String  stra=args[0];//ȡ��args����ĵ�һ��ֵ
		  int a=Integer.parseInt(stra);//��stra�ַ���ת������������
		  
		  if(a>=18)
		  {
			System.out.println("���Ѿ��ǳ������ˣ�");  
		  }else
		  {
			  System.out.println("�㻹û�г��꣬���ܴ���Ϸ��");
		  }
	}

}
