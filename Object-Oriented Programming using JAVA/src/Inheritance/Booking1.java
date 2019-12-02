package Inheritance;
import java.util.Scanner;
public class Booking1 {
	Scanner s=new Scanner(System.in);
	
	int persons,total_Days;
	double tariff; String roomType;
	
	public double book(int persons, int total_Days, Double tariff, String roomType)
	{
	 double t;	
	 if(roomType=="AC")
	 	{
	 		t=100;
	 	}
	 else
		 t=50;
		double  set=persons*total_Days*t;
		//System.out.println("Total Tariff: "+set);
		return set;
	}
	
}

