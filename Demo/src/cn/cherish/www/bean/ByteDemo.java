package cn.cherish.www.bean;
public class ByteDemo {
	public static void main(String[] args) {
		byte b=13;//byte �İ�װ��Byte
		Byte c=12;//��jdk1.5�󣬻������ͺͰ�װ��֮���Զ�ת��
		int d=b+c;//����byte���͵�������ӣ�ÿ�����Ͷ��Զ�ת����int
		/*
		 * ���ֵ����Сֵ����ֵ����ȣ�����Ϊ�������ֵ�Ĳ���
		 * ������������ӷ�+��λ
		 */
		System.out.println("max of byte:"+Byte.MAX_VALUE);
		System.out.println("min of byte:"+Byte.MIN_VALUE);
		System.out.println("d="+d);

	}

}
