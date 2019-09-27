package ch5_Demo;

 class Square implements Shapes {
	 public int x,y;
	 public int width,height;
	 

	@Override
	public double getArea() {
		return (width*height);
	}

	@Override
	public double getPerimeter() {
		return (2*(width+height));
	}
	
	public Square(int x,int y,int width,int height){
		this.x=x;
		this.y=y;
		this.height=height;
		this.width=width;
		
	}
}
