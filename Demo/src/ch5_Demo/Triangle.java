package ch5_Demo;

 class Triangle implements Shapes {
	 public int x,y;
	 public int width,height;
	 public double c;
	 

	@Override
	public double getArea() {
		return (0.5*width*height);
	}

	@Override
	public double getPerimeter() {
		return (width+height+c);
	}
	
	public Triangle(int x,int y,int base,int height){
		this.x=x;
		this.y=y;
		width=base;
		this.height=height;
		c=Math.sqrt(width*width+height*height);
	}

}
