package xyz.zzjava.www;
public class TryCatch {
public static void main(String[] args) {
	//����һ������ģ��
	int array[]= {0,1,2,3,4,5,6};
	try {
		//������ѭ����ֵ
		for(int i=0;i<10;i++) {
			System.out.println("array["+i+"]="+array[i]);
		}
	}catch(ArrayIndexOutOfBoundsException e) {//ʹ��catch��䲶���쳣
		System.out.println("array[]�ĳ�����"+array.length+",�����±�Խ����");
	}
	System.out.println("���н���");}
}
