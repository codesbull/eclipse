package cn.cherish.www.bean;

public class CircleArea {

	public static void main(String[] args) {
	    float pi=3.14f;//���峣��pi��Բ���ʣ�
        float area,perimeter;
        //����Բ�뾶
        float r=Float.parseFloat(args[0]);
        area=pi*r*r;
        perimeter=pi*2*r;
        System.out.println("r="+r);
        System.out.println("area=pi*r*r="+area);
        System.out.println("perimeter=pi*2*r="+perimeter);
	}

}
