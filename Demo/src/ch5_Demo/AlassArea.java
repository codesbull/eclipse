package ch5_Demo;

public class AlassArea {
	double x,y;
	double area(double x,double y) 
		{	double s;
			this.x=x;//借助this来表示引用的是类数据成员
			this.y=y;
			s=this.x*this.y;
			return s;
		}
}
