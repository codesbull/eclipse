package cn.cherish.www.bean;

public class ShortDemo {
		public static void main(String[] args) {
			System.out.println("max of short:"+Short.MAX_VALUE);
			System.out.println("min of short:"+Short.MIN_VALUE);
			
			byte a=12;
			short b=13;
			int  c=a+b;//�ڽ�����ѧ����ʱ��Ĭ��ת��Ϊ����
			System.out.println("a="+a);//+�ַ������ӷ�
			System.out.println("b="+b);
			System.out.println("c="+(a+b));
            System.out.println("c="+a+b);//+�ַ������ӷ�
	}

}
