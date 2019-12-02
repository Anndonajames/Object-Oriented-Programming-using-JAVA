package Inheritance;
import java.util.Scanner;

public class Constructor_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	int length,breadth,height,radius;
	System.out.println("1.Cube\n2.Sphere\n3.Cylinder");
	System.out.println("Enter the choice");
	int ch=s.nextInt();
	Shape sh=new Shape();
	switch(ch)
	{
	case 1:
	{
		System.out.println("length");
		length=s.nextInt();
		System.out.println("breadth");
		breadth=s.nextInt();
		System.out.println("height");
		height=s.nextInt();
		sh.Shape(length,breadth,height);
		break;
	}
	case 2:
	{
		System.out.println("radius");
		radius=s.nextInt();
		sh.Shape(radius);
		break;
	}
	case 3:
		System.out.println("radius");
		radius=s.nextInt();
		System.out.println("height");
		height=s.nextInt();
		sh.Shape(radius,height);
		break;
	}
	}
}
class Shape
{
	int cube;
	double cylinder,spehre;
	int length,breadth,height,radius;
	double pi=3.14;
	public void Shape(int length, int breadth, int height) {
		// TODO Auto-generated method stub
		this.length=length;
		this.breadth=breadth;
		this.height=height;
		int cube1=calculateAreaofCube(length,breadth,height);
		System.out.println("Area of Cube is "+cube1);
	
	}

	public int calculateAreaofCube(int length,int breadth,int height) {
		// TODO Auto-generated method stub
		
		return length*breadth*height ;
	}

	public void Shape(int radius, int height) {
		// TODO Auto-generated method stub
		this.radius=radius;
		this.height=height;
		cylinder=calculateAreaofCylinder(radius,height);
		System.out.printf("\nArea of Cube is %.1f",cylinder);
	
		
	}

	private double calculateAreaofCylinder(int radius, int height) {
		// TODO Auto-generated method stub
		return (2*pi*radius*height)+(2*pi*(radius*radius));
	}

	public void Shape(int radius) {
		// TODO Auto-generated method stub
		spehre=calculateAreaofSphere(radius);
		System.out.printf("Area of Spehere is %.1f ",spehre);
			
	}

	public double calculateAreaofSphere(int radius) {
		// TODO Auto-generated method stub
		return 4*pi*(radius*radius);
	}
	
	}