package cn.cherish.www.bean;
public class OperatorDemo {
	public static void main(String[] args) {
		byte a=12;
		int b=13;
		//�Ӹߵ����Զ�ת��
		int c=a+b;
		System.out.println("c="+c);
		long d=15;
		long e=d+a;
		System.out.println("e="+e);
		//Ĭ�ϵ���double����
		float f=13.5F;
	    float g=f+b;
	    System.out.println("g="+g);
		double h=2.999;
		//double����ǿ��ת����int����ȥС������
		int i=(int)(a+h);
		System.out.println("i="+i);
		//�Զ�ת����0.0�����޽ӽ���0����
		double j=b/0.0;
		System.out.println("j="+j);
		//����������
		int k=b%4;
		System.out.println("k="+k);
	}

}
