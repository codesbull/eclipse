package xyz.zzjava.www;
/*�ڸ����ס������ʹ��try-catch-finally��������Ԫ�ز�ƥ���쳣��
������finally������һ���ַ���*/
public class TryCatchFinally {
public static void hasException() {
	Object obj[]=new String[4];//�ܹ���һ���ַ�������
	for(int i=0;i<obj.length;i++) {
		try {
			if(i%2==1)
				obj[i]=new Integer(i);//�˾�ᷢ��ArrayStoreException�쳣
			else
				obj[i]=new Integer(i)+"";
			System.out.println(" "+obj[i]+"\n");
		}catch(ArrayStoreException e) {//������쳣
			System.out.println("����ArrayStoreException�쳣��������Ԫ���������������Ͳ�ƥ��");
		}finally {//ִ��finally���
			System.out.println("����finally�飬�ǳ������ִ�еĲ���\n");
		}
	}
	System.out.println("����ִ�н���");
}
public static void main(String[] args) {
	hasException();
	System.out.println("������������");
}
}
