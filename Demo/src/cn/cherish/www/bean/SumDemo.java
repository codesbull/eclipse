package cn.cherish.www.bean;

public class SumDemo {

	public static void main(String[] args) {
		if(args.length==2)//�����Сʹ��lengthȡ��
		{
			int a=Integer.parseInt(args[0]);
			
			int b=Integer.parseInt(args[1]);
			int sum=a+b;
			System.out.println("��һ�����ǣ�"+a);
			System.out.println("�ڶ������ǣ�"+b);
			System.out.println("����֮���ǣ�"+sum);
		}else{
			System.out.println("��������������ֵ����");
		}
	}

}
