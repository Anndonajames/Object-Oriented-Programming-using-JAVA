package String;

import java.util.Scanner;

public class case_Study2_string_buffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	StringBuffer car=new StringBuffer();
	StringBuffer bike =new StringBuffer();
	System.out.println("Enter your choice :");
	System.out.println("1)car \n2)Bike\n");
	int op=s.nextInt();
	switch (op)
	{
	case 1:
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
		break;
		
	case 2:
		
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
		break;

	default:
		break;
	}
	
	}

}
