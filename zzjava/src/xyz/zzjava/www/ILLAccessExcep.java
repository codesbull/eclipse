package xyz.zzjava.www;
import java.lang.reflect.Field;
public class ILLAccessExcep {
	public static void main(String[] args) {
//获得代表String类的类对象
		Class<?> clazz=String.class;
		//获得String类的所有域
		Field[] fields=clazz.getDeclaredFields();
		//遍历所有域
		for(Field field:fields) {
			if(field.getName().equals("hash")) {
				try {//输出hash值
					System.out.println(field.getInt("hash"));
				}catch(IllegalArgumentException e) {
					//捕获IllegalArgumentException异常
					e.printStackTrace();
				}catch(IllegalAccessException e) {
					//捕获IllegalAccessException异常
					e.printStackTrace();
				}
			}
		}	
	}
}
