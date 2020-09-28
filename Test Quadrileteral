import java.io.*;
import java.util.*;
import java.lang.*;
abstract class Quadriletaral{
	protected int x1,x2,x3,x4,y1,y2,y3,y4;
	protected void setCoordinate(int a,int b,int c,int d,int e,int f,int g,int h)
	{
		x1=a;
		y1=b;
		x2=c;
		y2=d;
		x3=e;
		y3=f;
		x4=g;
		y4=h;
	}
	public abstract int getArea();
}
class Square extends Quadriletaral{
	public Square(int a,int b,int c,int d,int e,int f,int g,int h)
	{
		setCoordinate(a,b,c,d,e,f,g,h);
	}
	public int getArea()
	{
		int d=(int)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		return d*d;
	}
}
class Rectangle extends Quadriletaral{
	public Rectangle(int a,int b,int c,int d,int e,int f,int g,int h)
	{
		setCoordinate(a,b,c,d,e,f,g,h);
	}
	public int getArea()
	{
		int d1=(int)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		int d2=(int)Math.sqrt((x1-x4)*(x1-x4)+(y1-y4)*(y1-y4));
		return d1*d2;
	}
}
class Parallelogram extends Quadriletaral{
	private int height;
	public Parallelogram(int a,int b,int c,int d,int e,int f,int g,int h,int height)
	{
		setCoordinate(a,b,c,d,e,f,g,h);
		this.height=height;
	}
	public int getArea()
	{
		int d=(int)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		return d*height;
	}
}


public class TestQuadrileteral{
	public static void main(String args[]){
		Square sq=new Square(10,10,20,10,20,20,10,20);
		System.out.println("Area of square: "+sq.getArea());
		Rectangle rec=new Rectangle(10,10,30,10,30,20,10,20);
		System.out.println("Area of Rectangle: "+rec.getArea());
		Parallelogram pgrm=new Parallelogram(10,10,30,10,20,20,0,20,8);
		System.out.println("Area of Parllelogram: "+pgrm.getArea());
	}
}
