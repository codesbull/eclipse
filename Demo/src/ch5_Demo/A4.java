package ch5_Demo;

 public class A4 {
	 int x=0;int y=1;
	 public void Printme() 
	 {
		 System.out.println("x="+x+"y="+y);
		 System.out.println("I'm an"+this.getClass().getName());
		 /*��this�����ʵ�ǰ����ĳ�Ա���� 
		  * ͨ��this��ʾ��ǰ��������ӡ��ǰ���������
		  * getClass���� getName������ϵͳ������ṩ�ķ���
		  */
	 }
}
