package Inheritance;
import java.util.Scanner;

import Booking1;
public class PeakSeason extends Booking1 {


int persons,total_Days,month,peakCharges;
double tariff,rate; 
String roomType;
Scanner s=new Scanner(System.in);
void roomBooking(int persons, int total_Days, double tariff, String roomType, int month ,double peakCharges)
{
	double cost= book(persons,total_Days,tariff,roomType);
	
	
	
	rate=cost+peakCharges;
	System.out.println("Total Tariff :"+rate);
}

}
