package ch5_Demo;

public class AlassArea {
	double x,y;
	double area(double x,double y) 
		{	double s;
			this.x=x;//����this����ʾ���õ��������ݳ�Ա
			this.y=y;
			s=this.x*this.y;
			return s;
		}
}
