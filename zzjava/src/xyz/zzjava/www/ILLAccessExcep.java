package xyz.zzjava.www;
import java.lang.reflect.Field;
public class ILLAccessExcep {
	public static void main(String[] args) {
//��ô���String��������
		Class<?> clazz=String.class;
		//���String���������
		Field[] fields=clazz.getDeclaredFields();
		//����������
		for(Field field:fields) {
			if(field.getName().equals("hash")) {
				try {//���hashֵ
					System.out.println(field.getInt("hash"));
				}catch(IllegalArgumentException e) {
					//����IllegalArgumentException�쳣
					e.printStackTrace();
				}catch(IllegalAccessException e) {
					//����IllegalAccessException�쳣
					e.printStackTrace();
				}
			}
		}	
	}
}
