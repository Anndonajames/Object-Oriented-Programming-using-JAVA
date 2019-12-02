package Inheritance;
import java.util.Scanner;
public class CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	int persons,total_Days;
	double tariff; String roomType;
	
	System.out.println("Enter the number of Persons:   ");
	persons=s.nextInt();
	System.out.println("Total number of days:  ");
	total_Days=s.nextInt();
	System.out.println("Tariff per day:   ");
	tariff=s.nextDouble();
	System.out.println("Room Type :    ");
	roomType=s.next();
	Season_Booking sb=new Season_Booking();
	sb.roomBooking(persons, total_Days, tariff, roomType);
	
	
	
	
	}

}
