package cn.cherish.www.bean;
public class Iftrsswitch {
	
	
	public static void main(String[] args) {
		int grade=Integer.parseInt(args[0]),a,b;
		if(grade==7){
			System.out.println(" ");
		}else if(grade==6){
			a=11;b=22;
			System.out.println("a="+a+"b="+b);
		}else if(grade==5){
			a=33;b=44;
			System.out.println("a="+a+"b="+b);
		}else{
			a=55;
			System.out.println("a="+a);
		}
	}
}
