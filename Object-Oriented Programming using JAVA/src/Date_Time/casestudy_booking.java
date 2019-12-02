package date_time;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Scanner;

public class casestudy_booking {
	public static void main(String[] args) {

//	Scanner s=new Scanner(System.in);
//	System.out.println("Enter the name :");
//	String name=s.nextLine();
//	System.out.println("Enter the Address :");
//	String address=s.nextLine();
//	System.out.println("Number of persons :");
//	int persons=s.nextInt();
////	int r=persons/2;
//////	if(r)
//	System.out.println("Number of Room :");
//	int room=s.nextInt();
//	
//	System.out.println("AC or Non-AC :");
//	String ac=s.next();
//	System.out.println("Booking Date :");
//	String date=s.next();
//	System.out.println("Checkout Date");
//	String check_out_date=s.next();
//	
//	System.out.println("Registration Details:");
//	System.out.println("Name :"+name);
//	System.out.println("Address: "+address);
//	System.out.println("No. of rooms :"+room);
//	System.out.println("No. of Guest :"+persons);
//	int ac_amount,flag=0;
//	if(ac.equals("AC"))
//	{
//		ac_amount=100;
//		flag=1;
//		
//	}
//	else
//		{ac_amount=0;
//		flag=0;
//		}
//	if(flag==1)
//		System.out.println("AC :Yes");
//	else
//		
//		System.out.println("AC :No");
//	
//	
//	LocalDate ds = LocalDate.parse(date);
//    LocalDate de = LocalDate.parse(check_out_date);
//    long total_days = ChronoUnit.DAYS.between(ds,de);
//    System.out.println("No of days:"+total_days);
//    int rent=500,flag1=0;
//    
//    
//    if(persons==(room*2)+1)
//    {
//    	
//    	int amount=(int) ((500+ac_amount)*(persons*total_days))+250;
//    	System.out.print("Amount :"+amount);
//    }
//    else 
//    {
//    	//System.out.println("You want to take one more room");
//    	int amount=(int) ((500+ac_amount)*(persons*total_days));
//    	System.out.print("Amount :"+amount);
//    	
//    }
//	}
//}

		
		
		
		
		
		
		
		package Date_Time;

		import java.util.Scanner;
		import java.time.LocalDate;
		import java.time.temporal.ChronoUnit;
		import java.util.Calendar;
		import java.util.Date;
		public class Booking {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);String pr="";int i=112;
		do {
		System.out.println("================");	
		System.out.println("**REGISTRATION**");
		System.out.println("================");	
		System.out.println("Enter the name");
		String name=s.next();
		System.out.println("Enter the address");
		String address=s.next();
		System.out.println("Enter the no of rooms");
		int room=s.nextInt();
		System.out.println("Enter the no of person");
		int person=s.nextInt();
		System.out.println("AC/Non-AC");
		String ac=s.next();
		   
		System.out.println("Booking date");
		String first = s.next();
		System.out.println("Checkout date");// format 2017-11-20
		String second = s.next();
		   LocalDate ds = LocalDate.parse(first);
		   LocalDate de = LocalDate.parse(second);
		   long op = ChronoUnit.DAYS.between(ds,de);
		   
		long total=0;int p=(person%2);
		if(person%2!=0) {
		if(ac.equals("AC")==true) {
		total=(op*(((person-p)*500)+((person-p)*150)+(p*150)+(p*250)));
		}
		else {
		total=(op*(((person-p)*500)+(p*250)));}
		}
		else {

		if(ac.equals("AC")==true) {
		total=(op*((person*500)+(person*150)));
		}
		else {
		total=(op*((person*500)));
		}
		}

		System.out.println("Registration details : ");
		System.out.println("Name : "+name);
		System.out.println("Address : "+address);
		System.out.println("No of rooms : "+room);
		System.out.println("No of guest : "+person);
		System.out.println("AC : "+ac);
		System.out.println("No of days : "+op);
		System.out.println("Amount : "+total);
		System.out.println("Do you want to continue the registration ?(y/n)");
		pr=s.next();
		}while(pr.equals("n")==true);
		System.out.printf("Thank you for registering your id is %d",i);
		i++;
		}

		private static Date getDate(String first) {
		// TODO Auto-generated method stub
		return null;
		}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		