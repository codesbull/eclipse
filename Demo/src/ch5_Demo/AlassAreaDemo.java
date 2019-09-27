package ch5_Demo;

public class AlassAreaDemo extends  AlassArea {

	public static void main(String[] args) {
		double a=2.2,b=3.1,z;
		AlassAreaDemo ss=new AlassAreaDemo();//创建ss的对象
		z=ss.area(a,b);//引用父类对象的成员方法求面积
		System.out.println("z="+z);
	}

}
