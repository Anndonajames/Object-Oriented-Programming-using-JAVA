package Inheritance;
import java.util.Scanner;

public class Hierarchical_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the details of Sports Bike");
	System.out.println("Name of the bike:");
	String name=s.next();
	System.out.println("Color of the bike:");
	String color=s.next();
	System.out.println("Capacity(CC) of the bike:");
	float cc=s.nextFloat();
	System.out.println("Speed of the bike:");
	int speed=s.nextInt();
	System.out.println("Price of the bike:");
	Double price=s.nextDouble();
	System.out.println("Discount of the bike:");
	int discount=s.nextInt();
	
	System.out.println("Enter the details of Scooter");
	System.out.println("Name of the Scooter:");
	String name2=s.next();
	System.out.println("Color of the Scooter:");
	String color2=s.next();
	System.out.println("Capacity(CC) of the Scooter:");
	float cc2=s.nextFloat();
	System.out.println("Speed of the Scooter:");
	int speed2=s.nextInt();
	System.out.println("Price of the Scooter:");
	Double price2=s.nextDouble();
	System.out.println("Discount of the Scooter:");
	int discount2=s.nextInt();
	System.out.println("Weight of the Scooter:");
	int weight2=s.nextInt();
	Bike b=new Bike();
	Scooter sc=new Scooter();
	SportBike sb=new SportBike();
	
	sb.display(name, color, cc, speed, price,discount);
	sc.display(name2, color2, cc2, speed2, price2,discount2,weight2);
	
	}

}
 class Bike
{ 
	 String name,color;
	float cc;
	double price;
	int speed,weight,discount;	
	public void  display(String name, String color,float cc, int speed, Double price, int weight) 
	{
		
	this.name=name;
	this.color=color;
	this.cc=cc;
	this.speed=speed;
	this.price=price;
	this.discount=discount;
	}
	
}
 
 class SportBike extends Bike
 {
	 
		public void display(String name, String color, float cc, int speed, Double price,int discount) 
			
		{
			
			System.out.println("Sports Bike :");
			System.out.println("Name :"+name);
			System.out.println("Color :"+color);
			System.out.println("Capacity :"+cc);
			System.out.println("Speed :"+speed);
			System.out.println("Price :"+price);
			System.out.println("Manufacturer Discount :"+discount);
			double sp=price-discount;
			System.out.println("Sports Bike price is :"+sp);

		}
}	
 
 