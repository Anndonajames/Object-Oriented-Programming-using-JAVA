package String;

import java.util.Scanner;


public class String_casestudy_22 {

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
		
		StringBuffer car=new StringBuffer();
		
		
		void displayDetails()
		{
			
			System.out.println("Enter the details of Car:");
			System.out.println("Enter the colour");
			car.append("Color: "+s.next()+"\n");
			System.out.println("Enter the maximum Speed");
			car.append("Speed: "+s.next()+"\n");
			System.out.println("Enter the number of seats");
			car.append("Seats: "+s.next()+"\n");
			System.out.println("Enter the number of wheels");
			car.append("Wheels: "+s.next()+"\n");
			System.out.println("Enter the number of doors");
			car.append("Doors: "+s.next()+"\n");
			System.out.println("Enter the status of AC(true/false)");
			car.append("AC Status: "+s.next()+"\n");
			System.out.println(car);
		}
	}

	class Bike extends Vehicle
	{
		Scanner s=new Scanner(System.in);
		String color,status_disk_break;
		int max_speed,seat,wheels;
		StringBuffer bike =new StringBuffer();
		
		void displayDetails()
		{
			
			
			System.out.println("Enter the details of Bike:");
			System.out.println("Enter the colour");
			bike.append("Color: "+s.next()+"\n");
			System.out.println("Enter the maximum Speed");
			bike.append("Speed: "+s.next()+"\n");
			System.out.println("Enter the number of seats");
			bike.append("Seats: "+s.next()+"\n");
			System.out.println("Enter the number of wheels");
			bike.append("Wheels: "+s.next()+"\n");
			System.out.println("Enter the number of doors");
			bike.append("Doors: "+s.next()+"\n");
			System.out.println("Enter the status of diskbreak(true/false)");
			bike.append("Disbreak Status: "+s.next()+"\n");
			System.out.println(bike);
			
		}
	}





	class Vehicle
	{
		
			
			
		
		
	}
	