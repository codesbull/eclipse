package cn.cherish.www.bean;

public class CircleArea {

	public static void main(String[] args) {
	    float pi=3.14f;//定义常量pi（圆周率）
        float area,perimeter;
        //输入圆半径
        float r=Float.parseFloat(args[0]);
        area=pi*r*r;
        perimeter=pi*2*r;
        System.out.println("r="+r);
        System.out.println("area=pi*r*r="+area);
        System.out.println("perimeter=pi*2*r="+perimeter);
	}

}
