package cn.cherish.www.bean;

public class IntegerDemo1 {

	public static void main(String[] args) {
		byte b=127;
		short s=3276;
		int a=12;
		long l=1;
		//�����Զ�ת����byte��short������ӣ������int����
		int aa=b+s;
		long bb=a+1;
		System.out.println("byte�������ֵ��"+Byte.MAX_VALUE);
		System.out.println("short�������ֵ��"+Short.MAX_VALUE);
		System.out.println("int�������ֵ��"+Integer.MAX_VALUE);
		System.out.println("long�������ֵ��"+Long.MAX_VALUE);
		/**���ͣ�byte(Byte)��short��Short����int��Integer����long��Long��
		 * ��jdk1.5�󣬻������ͺͰ�װ�ࣨwrapper class��֮���Զ��Ĳ���ͷ���
		 */
		int ab=3;
		//Integer ac=3  ��  Integer ac=new Integer(3); ������ͬ
		//int grade=Integer.parseInt(args[0]);//ȡ��������ת��Ϊ����
		Integer ac=3;
		int ad=ab+ac;
		System.out.println("ad="+ad);
	}

}
