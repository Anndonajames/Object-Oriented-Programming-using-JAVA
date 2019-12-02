package Inheritance;
import java.util.Scanner;
public class LeanSeason extends Booking1 {

	int persons,total_Days,month,discount;
	double tariff,rate; 
	String roomType;
	void roomBooking(int persons, int total_Days, double tariff, String roomType, int month ,double discount)
 {
		// TODO Auto-generated method stub
		
			
			double cost= book(persons,total_Days,tariff,roomType);
			rate=(discount/100)*cost;
			System.out.println("Total Tariff :"+rate);
			
		
		
	}

}
