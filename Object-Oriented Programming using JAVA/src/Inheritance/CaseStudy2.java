package Inheritance;
import java.util.Scanner;

import OOPS.PeakSeason;
public class CaseStudy2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		// TODO Auto-generated method stub
		int persons,total_Days,month,peakCharges,discount;
		double tariff,rate; 
		String roomType;
		
		System.out.println("Enter the number of Persons:   ");
		persons=s.nextInt();
		System.out.println("Total number of days:  ");
		total_Days=s.nextInt();
		System.out.println("Tariff of one person:   ");
		tariff=s.nextDouble();
		System.out.println("Room Type :    ");
		roomType=s.next();
		PeakSeason ps=new PeakSeason();
		LeanSeason ls=new LeanSeason();
		System.out.println("Enter month");
		month=s.nextInt();
				
		if(month==4 || month==5 ||month==6 ||month==9 ||month==11 ||month==12 )
		{
		
			System.out.println("Enter Peak Charge");
			peakCharges=s.nextInt();
			ps.roomBooking(persons, total_Days, tariff, roomType,month,peakCharges);
		}
		else 
			

		{
			System.out.println("Enter Discount");
			discount=s.nextInt();

		ls.roomBooking(persons, total_Days, tariff, roomType,month,discount);	
		
		
		
		
		
	}
}

	
}


