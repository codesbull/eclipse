package cn.cherish.www.bean;
public class IfDemo2 {
	public static void main(String[] args) {
		 /*
	      * 模拟用户修改密码  旧密码：123
	      * 新密码：1234
	      * 确认密码：1234
	      */
			String oldPass=args[0];
			String newPass=args[1];
			String confirmPass=args[2];
			if(oldPass.equals("123"))
			{
				if(newPass.equals(confirmPass))
				{
					System.out.println("两次新密码一致，修改成功！");
				}else
				{
					System.out.println("两次新密码不一致，修改不成功！");
				}
			}else
			{
				System.out.println("旧密码不正确！");
			}
	}

}
