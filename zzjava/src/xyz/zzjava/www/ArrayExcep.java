package xyz.zzjava.www;
/*�����±�Խ���쳣�� ArrayIndexOutOfBoundsException
�����ʵ�����Ԫ�ص��±�ֵ�������������±�ֵʱ����
Ҳ����˵����Ԫ�ص��±�ֵ���ڵ�������ĳ���ʱ����
*/
public class ArrayExcep {
	public static void main(String[] args) {
		int a[]=new int[5];//����һ����СΪ5������
		for(int i=0;i<10;i++) {//������0~9��forѭ����ֵ
			a[i]=i+1;
			System.out.print(" "+a[i]);//��ӡ������
		}
	}
}
