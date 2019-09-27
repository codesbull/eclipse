package cn.cherish.www.bean;

public class IfDemo4 {

	public static void main(String[] args) {
		int y;int x=Integer.parseInt(args[0]);
		if(x>=10){
			y=4*x;
			System.out.println("y="+y);
		}else if(x>=1){
			y=3*x-2;
			System.out.println("y="+y);
		}else{
			y=x;System.out.println("y="+y);
		}
	}
}
