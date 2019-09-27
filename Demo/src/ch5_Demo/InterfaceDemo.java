package ch5_Demo;

import java.awt.Graphics;


public class InterfaceDemo {
	Square Box=new Square(5,15,25,25);
	Triangle tri=new Triangle(5,50,8,4);
	Circle Oval=new Circle(5,90,25,25);
	
	public void paint(Graphics g){
		g.drawRect(Box.x, Box.y, Box.width, Box.height);
		g.drawString("Box Area:"+Box.getArea(), 50, 35);
		System.out.println("*******************************");
		g.drawString("Box Perimeter:"+Box.getPerimeter(),50, 55);
		g.drawString("tri Area:"+tri.getArea(), 50, 75);
		g.drawString("tri Perimeter:"+tri.getPerimeter(), 50, 95);
		System.out.println("*******************************");
		g.drawOval(Oval.x, Oval.y, Oval.width, Oval.height);
		g.drawString("oval Area£º"+Oval.getArea(), 50, 115);
	}

}
