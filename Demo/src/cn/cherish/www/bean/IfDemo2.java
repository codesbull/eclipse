package cn.cherish.www.bean;
public class IfDemo2 {
	public static void main(String[] args) {
		 /*
	      * ģ���û��޸�����  �����룺123
	      * �����룺1234
	      * ȷ�����룺1234
	      */
			String oldPass=args[0];
			String newPass=args[1];
			String confirmPass=args[2];
			if(oldPass.equals("123"))
			{
				if(newPass.equals(confirmPass))
				{
					System.out.println("����������һ�£��޸ĳɹ���");
				}else
				{
					System.out.println("���������벻һ�£��޸Ĳ��ɹ���");
				}
			}else
			{
				System.out.println("�����벻��ȷ��");
			}
	}

}
