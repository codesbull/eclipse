package cn.cherish.www.bean;

public class ForDemo1 {
	public static void main(String[] args) {
		int k = 0,s = 0;
		for(int i = 1;i<=10;i++){
			k=i*i;
			s=s+k;
		}
		System.out.println("s="+s);
	}

}
