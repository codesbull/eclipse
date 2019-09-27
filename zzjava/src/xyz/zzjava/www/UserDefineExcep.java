package xyz.zzjava.www;

import org.omg.CORBA.UserException;
public class UserDefineExcep {
public static void main(String[] args) {
	//捕获userException
	try {
		throw new userException("自定义异常类");
	}catch(userException e) {//打印userException异常信息
		System.out.println("异常信息是：\n"+e.toString());
	}
}
}
//创建一个异常类
class userException extends Exception{
	public  userException(String message) {//根据指定的异常信息自定义userException
		super(message);
	}
}
