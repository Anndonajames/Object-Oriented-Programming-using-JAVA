package String;

import java.util.Scanner;

public class caseStudy_string_buffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	StringBuffer sb=new StringBuffer(); 
	
	
	System.out.println("Enter your name:");
	sb.append("Name: "+s.nextLine()+"\n");
	System.out.println("Enter your address:");
	sb.append("Address: "+s.nextLine()+"\n");
	System.out.println("Enter your contact number:");
	sb.append("Contact Number: "+s.nextLine()+"\n");
	System.out.println("Enter your Email ID:");
	sb.append("Email ID: "+s.nextLine()+"\n");
	System.out.println("Enter proof Type:");
	sb.append("Proof Type: "+s.nextLine()+"\n");
	System.out.println("Enter proof Id:");
	sb.append("Proof ID: "+s.nextLine()+"\n");
	System.out.println(sb);
	System.out.println("Thank you for registering.Your id is 1...");
//	System.out.println("Do you want to continue registration?(yes/no)");
//	String op=s.nextLine();
//	if(op.equals("yes"))
//	{
//		System.out.println("Do you want update the email id?(yes/no)");
//		String op1=s.nextLine();
//		if
//		
//	}
//	
	
	
	
	
	
	
	
	}

}
