package xyz.zzjava.www;
/*�ڸ������������ʹ��Ƕ��try-catch-finally��������Խ��������쳣*/
public class NestTryCatch {
public static void main(String[] args) {
	//����һ������Ϊ5����������
	int array[]=new int[5];
	int n=0;
	//ʹ��forѭ�����и�ֵ
	for(int i=0;i<array.length;i++) {
		array[i]=i;
	}
	//��ѭ�����ܻ������������Խ���쳣
	for(int i=0;i<10;i++) {
		try {
			try {
				//������ܻ���ֳ�0�쳣
				n=array[i]/(i-1);
			}catch(ArithmeticException e){
				//���������쳣
				System.out.println("0������������");
			}
			System.out.println(n);
		}catch(IndexOutOfBoundsException e){
			//������������Խ���쳣
			System.out.println("����Խ���쳣");
		}
	}
}
}
