package xyz.zzjava.www;
/*����������ʱ����ʱ��Ҫ�Բ�ͬ�����ͽ�������ת����
��������ת��ʱ����Java������������������Ͳ����ݶ��޷����ת��ʱ�����ClassCastException�쳣*/
public class ClassCastExcep {

	public static void main(String[] args) {
		//����һ��Integer���͵Ķ���
		Object x=new Integer(0);
		//��xת��Ϊһ��String���͵ı���
		System.out.println((String)x);
	}
}
