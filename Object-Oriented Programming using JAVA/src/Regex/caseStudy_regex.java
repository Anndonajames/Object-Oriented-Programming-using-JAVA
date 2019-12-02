package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class caseStudy_regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	Pattern fname_p=Pattern.compile("^[A-Z][a-z]*$");
	System.out.println("Enter Your First name:");
	String fname=s.nextLine();
	Matcher fname_m=fname_p.matcher(fname);
	if(fname_m.matches())
	{
		System.out.println("Valid First Name ");
	}
	else
		System.out.println("Invalid First name");
	
	Pattern sname_p=Pattern.compile("^[A-Z][a-zA-Z]*$");
	System.out.println("Enter the second Name : ");
	String sname=s.nextLine();
	Matcher sname_m=sname_p.matcher(sname);
	if(sname_m.matches())
		{
			System.out.println("Valid Second Name ");
		}
		else
			System.out.println("Invalid Second name");
	Pattern email_p=Pattern.compile("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$");
	System.out.println("Enter Your Email Id");
	String email=s.nextLine();
	Matcher email_m=email_p.matcher(email);
	if(email_m.matches())
	{
			System.out.println("Valid Mail Id ");
	}
		else
	System.out.println("Invalid Mail Id");
	
	Pattern regno_p=Pattern.compile("^[0-9]{7}$");
	System.out.println("Enter Your Register Number:");
	String regno=s.nextLine();
	Matcher regno_m=regno_p.matcher(regno);
	if(regno_m.matches())
	{
		System.out.println("Valid Register Number ");
	}
		else
	System.out.println("Invalid Register Number");
	
	Pattern rank_p=Pattern.compile("^[0-9]{1,15}$");
	System.out.println("Enter Your Rank:");
	String rank=s.nextLine();
	Matcher rank_m=rank_p.matcher(rank);
	if(rank_m.matches())
	{
		System.out.println("Valid Rank ");
	}
		else
	System.out.println("Invalid Rank");
	
	Pattern year_p=Pattern.compile("^[0-9]{4}$");
	System.out.println("Enter  year:");
	String year=s.nextLine();
	Matcher year_m=year_p.matcher(year);
	if(year_m.matches())
	{
		System.out.println("Valid year ");
	}
		else
	System.out.println("Invalid year");
	
	Pattern dept_p=Pattern.compile("^[A-Z][.][A-Za-z ]*$");
	System.out.println("Enter Your Department:");
	String dept=s.nextLine();
	Matcher dept_m=dept_p.matcher(dept);
	if(dept_m.matches())
	{
		System.out.println("Valid Department ");
	}
		else
	System.out.println("Invalid Department");
		
	
	if(fname_m.matches() && sname_m.matches() && email_m.matches() && regno_m.matches() && rank_m.matches()  && year_m.matches() && dept_m.matches())
	{
		System.out.println("Login");
		System.out.println("Username :"+email);
		Pattern Pwdptrn=Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15})");
		System.out.println("Enter Password :");	
		String pwd=s.next();
		Matcher p_m=Pwdptrn.matcher(pwd);
		if(p_m.matches())
		{
			System.out.println("Valid Password");
			System.out.println("WELCOME "+fname+" Login Sucessfull");
			
		}
		else
			System.out.println("Invalid Password");

		
	}
	else
		System.out.println("Invalid Details Entered!!\n Try Again ");
}
}