package Inheritance;
import Booking;

public class Season_Booking extends Booking {
	
	
  public void  roomBooking(int persons,int total_Days, double tariff, String roomType)
  {
	 // System.out.println("Total Tariff");
	  book(persons, total_Days, tariff, roomType);
	 
  }
}
