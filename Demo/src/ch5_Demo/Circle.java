package ch5_Demo;

public class Circle implements Shapes {
	 public int x,y;
	 public int width,height;
	 public double r;
	 
	@Override
	public double getArea() {
		return (r*r*Math.PI);
	}

	@Override
	public double getPerimeter() {
		return (2*Math.PI*r);
	}
	public Circle(int x,int y,int height, int width){
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
		r=(double)width/2.0;
	}
}
