package xyz.zzjava.www;
/*�����쳣
 * ��ָ������0�����������쳣��Java�У����һ��������0������ô���׳�ArithmeticException�쳣��
 * ���Ǹ�������0�����������������쳣��
 */
public class ArithExcep {
	public static void main(String[] args) {
		double a=1.0;
		System.out.println(a/0);
		for(int i=10;i>0;i--){//0~10ѭ��
			System.out.print(" "+(i/(i-1)));
			if (i%5==0) {//������Ա�5��������
				System.out.println();
			}
		}
	}
}
