package xyz.zzjava.www;

/*����Ԫ�����Ͳ�ƥ���쳣��һ�ֽ��������͵Ķ���洢��һ����������ʱ�׳����쳣��
�ڸ��������������ͼ��int���͵�����Ԫ�ظ�ֵ������ΪObject���͵�obj���顣*/
public class ArrayStoreExcep {
	public static void main(String[] args) {
		//������������ΪObject���͵�����
		Object obj[]=new String[5];
		for(int i=0;i<obj.length;i++) {
			//��int���͵�����Ԫ�ظ�ֵ��obj����
			obj[i] =new Integer(i);
			System.out.println(" "+obj[i]);
		}
	}
}
