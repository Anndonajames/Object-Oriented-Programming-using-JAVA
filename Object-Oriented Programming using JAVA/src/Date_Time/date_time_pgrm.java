package Date_Time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class date_time_pgrm {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to get current date
		System.out.println("Today Date");
		LocalDate date=LocalDate.now();
		System.out.println(date);
		
		//to get current time 
		System.out.println("Today Time");
		LocalTime time=LocalTime.now();
		System.out.println(time);
		
		//to get current date and  time
		System.out.println("Current date and time");
		LocalDateTime dt=LocalDateTime.now();
		System.out.println(dt);
	
	}
}
