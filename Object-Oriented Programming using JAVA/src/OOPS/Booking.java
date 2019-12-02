package OOPS;
import java.util.Scanner;
public class Booking {
	static int id[]=new int[20];
	static int i=1;
	static int j=1;
	static int m=10;
	public static int booked[]=new int[25];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		//int i=1;
		String name[]=new String[25];
		String email_id[]=new String[25];
		
		String regcont,regbook;
		String address,num,proof_type,proof_id;
		do
		{
			System.out.println("Registration");
			System.out.println("Enter Your name: ");
			name[i]=s.next();
			System.out.println("Enter Your address: ");
			address=s.next();
			System.out.println("Enter Your Contact Number: ");
			num=s.next();
			System.out.println("Enter Your Email ID: ");
			email_id[i]=s.next();
			System.out.println("Enter Your proof Type: ");
			proof_type=s.next();
			System.out.println("Enter Your Proof Id: ");
			proof_id=s.next();
			
			System.out.println("Thanks for registering your id is "+m);
			Customer c=new Customer( name,address,num,email_id,proof_type,proof_id);
			System.out.println("Do you want to book room(yes/no)? ");
		 regbook=s.next();
		if(regbook.equals("yes")==true)
		{
			c.book();
		}
		
		
		System.out.println("Thank you for booking  your room number is "+i);
		
		booked[j]=i;
		id[j]=m;
		j++;
		i++;
		m++;
		
		
		System.out.println("Do you want to continue registration(yes/no)? ");
		
		regcont=s.next();
		}
		while(regcont.equals("yes")==true);
		int s_date,e_date;
			System.out.println("View all Bookings");
			System.out.println("Enter the start date:");
			s_date=s.nextInt();
			System.out.println("Enter the end date:");
			e_date=s.nextInt();
			
			System.out.println("The booking are made from "+s_date+ " to "+e_date);
		System.out.println("Room Number     Name     Customer Id ");
		for(int k=1;k<i;k++)
		{
			System.out.println(booked[k]+ "      "+name[k]+ "    "+id[k]);
		}
		
		
	}
	//	String op;
}

 class Customer
{
	 int i=1;
	 
	String name,address,num,email_id,proof_type,proof_id;
	public Customer(String[] name2, String address, String num, String[] email_id2, String proof_type, String proof_id) {
		//this.name[i]=name2;
		this.address=address;
		this.num=num;
		//this.email_id[i]=email_id2;
		this.proof_type=proof_type;
		this.proof_id=proof_id;
	}
	
	
	static void  book()
	{
	String ac,cot,cable,wifi,laundry,proceed;
	Scanner s=new Scanner(System.in);
	int total,b=0,c,d,e,f,i=1;
	do {
	System.out.println("Booking");
	System.out.println("Plz choose the service request");
	System.out.println("AC/non-AC(AC/nAC)");
	ac=s.next();
	if(ac.equals("AC"))
	{
	b=1000;
	}
	else
	{
	b=750;
	}

	System.out.println("Cot(Single/Double)");
	cot=s.next();
	if(cot.equals("Single"))
	{
	c=0;
	}

	else
	{
	c=350;
	}
	System.out.println("With cable connection/without cable connection(C/nC)");
	cable=s.next();
	if(cable.equals("W"))
	{
	d=50;
	}
	else
	{
	d=0;
	}
	System.out.println("Wi-Fi needed or not(W/nW)");
	wifi=s.next();
	if(wifi.equals("W"))
	{
	e=200;
	}
	else
	{
	e=0;
	}
	System.out.println("Laundry service needed or not(L/nL)");
	laundry=s.next();
	if(laundry.equals("L"))
	{
	f=100;
	}
	else
	{
	f=0;
	}
	System.out.println("Enter the date of booking");
	int date=s.nextInt();
	total=b+c+d+e+f;
//	System.out.println(ac+"room");
	System.out.println("The total charge is Rs."+total);
	System.out.println("The services chosen are");
	 
	if(c==0)
	{
	System.out.println("Single cot");
	}
	else
	{
	System.out.println("Double cot");
	}
	if(d==50)
	{
	System.out.println("Cable connection enabled");
	}
	else
	{
	System.out.println("Cable connection not enabled");
	}
	if(e==200)
	{
	System.out.println("WiFi enabled");
	}
	else
	{
	System.out.println("WiFi not enabled");
	}
	if(f==100)
	{
	System.out.println("with laundry service");
	}
	else
	{
	System.out.println("No laundry service");
	}
	System.out.println("Do you want to proceed(yes/no)");
	 proceed=s.next();
	}while(proceed.equals("no"));
	if(proceed.equals("Yes"))
	{
	//System.out.println("Thank you for booking  your room number is "+i);
	i++;

	}
	//System.out.println("Thank you for booking ")
	
	
	}
	
		// TODO Auto-generated constructor stub
	}
	
