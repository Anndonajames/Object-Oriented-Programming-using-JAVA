package Polymorphism_caseStudy;
import java.util.*;
public class Casestudy_polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
	//		Vehicle v=new Vehicle();
		Car c=new Car();
		Bike b=new Bike();
		int op;
		
				// TODO Auto-generated method stub
				System.out.println("1)Car\n2)Bike");
				op=s.nextInt();
				switch(op)
				{
				case 1:
					c.displayDetails();
					break;
				case 2:
					b.displayDetails();
					break;
				default:
					System.out.println("Invalid Option");
					break;
				}
		
		

	}

}

class Car extends Vehicle
{
	Scanner s=new Scanner(System.in);
	String color,status_ac;
	int max_speed,seat,wheels,doors;
	void displayDetails()
	{
		
		System.out.println("Enter the details of car");
		System.out.println("Enter the color");
		color=s.nextLine();
		System.out.println("Enter the maximum speed");
		max_speed=s.nextInt();
		System.out.println("Enter the number of seats");
		seat=s.nextInt();
		System.out.println("Enter the number of wheels");
		wheels=s.nextInt();
		System.out.println("Enter the number of doors");
		doors=s.nextInt();
		System.out.println("Enter the status of AC(true/false)");
		status_ac=s.next();
		System.out.println("Car Details");
		System.out.println("Color : "+color);
		System.out.println("Maximum Speed : "+max_speed);
		System.out.println("Number of Seats : "+seat);
		System.out.println("Number of Wheels : "+wheels);
		System.out.println("Number of Doors : "+doors);
		System.out.println("AC : "+status_ac);
	}
}

class Bike extends Vehicle
{
	Scanner s=new Scanner(System.in);
	String color,status_disk_break;
	int max_speed,seat,wheels;
	void displayDetails()
	{
		
		System.out.println("Enter the details of car");
		System.out.println("Enter the color");
		color=s.nextLine();
		System.out.println("Enter the maximum speed");
		max_speed=s.nextInt();
		System.out.println("Enter the number of seats");
		seat=s.nextInt();
		System.out.println("Enter the number of wheels");
		wheels=s.nextInt();
		System.out.println("Enter the status of Disk Break(true/false)");
		status_disk_break=s.next();
		
		System.out.println("Bike Details");
		System.out.println("Color : "+color);
		System.out.println("Maximum Speed : "+max_speed);
		System.out.println("Number of Seats : "+seat);
		System.out.println("Number of Wheels : "+wheels);
	
		System.out.println("Disk Break : "+status_disk_break);
		
	}
}





class Vehicle
{
	
		
		
	
	
}