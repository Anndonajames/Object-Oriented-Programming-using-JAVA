package Polymorphism_caseStudy;
import java.util.Scanner;
public class polymorphism_casestudy2 {
	public static void main(String  args[])
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the Telephone Bill Number");
	int bill_num=s.nextInt();
	System.out.println("Enter the Customer Name:");
	String  name=s.next();
	System.out.println("Enter the Number of Calls made:");
	int no_calls =s.nextInt();
	System.out.println("Enter the Cost per Call:");
	double cost_call =s.nextDouble();
	TelePhoneBill tb=new TelePhoneBill();
	
	//tb.generateBill(bill_num,name,no_calls,cost_call);
	System.out.println("Enter the Current Bill Number:");
	int bill_Num =s.nextInt();
	System.out.println("Enter the Customer Name:");
	String cust_name =s.next();
	System.out.println("Enter the Number of Units consumed :");
	int no_units =s.nextInt();
	System.out.println("Enter the cost per unit:");
	double cost_per_unit =s.nextDouble();
	CurrentBill cb=new CurrentBill();
	tb.generateBill(bill_num,name,no_calls,cost_call);

	cb.generateBill(bill_Num,cust_name,no_units,cost_per_unit);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}

 class Bill
{
//	private int billNumber;
//	private String name;
//	public Bill(int bill_num, String name) {
//		// TODO Auto-generated constructor stub
//		this.billNumber=bill_num;
//		this.name=name;
//	}
//	
//	void generateBill( )
//	{
//		System.out.println("Bill Number :"+billNumber);
//		System.out.println("Customer Name :"+name);
//	}
	
}
 class TelePhoneBill extends Bill
 {
	
	private int numberOfCallsMade;
	private double costPerCall;
	double tele_bill_amount;
	//int bill_num;
	//String name;

	void generateBill(int bill_num,String name,int no_calls,Double cost_call)
	{
		
		System.out.println(" Bill Number:"+bill_num);
		System.out.println(" Customer Name:"+name);
		tele_bill_amount=no_calls*cost_call;
		
		System.out.println("Telephone Bill Amount:"+tele_bill_amount);
		//System.out.println("Custom :"+name);
	}
}
 class CurrentBill extends Bill
 {
	
	
	 double current_bill_amount;
	
	
	void generateBill(int bill_Num,String cust_name,int num_units,double cost)
	{
		System.out.println(" Bill Number:"+bill_Num);
		System.out.println(" Customer Name:"+cust_name);
		current_bill_amount=num_units*cost;
		System.out.println("Current Bill Amount:"+current_bill_amount);
		
	}
 }
	 
 