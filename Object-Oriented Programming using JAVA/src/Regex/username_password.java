package Regex;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;;;
public class username_password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	String regex="^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
	Pattern Pwdptrn=Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15})");
	Pattern pattern=Pattern.compile(regex);
	
	System.out.println("Enter the Email Id:");
	String email=s.next();
	Matcher m=pattern.matcher(email);
	
	System.out.println("Enter Password :");
	String pwd=s.next();
	Matcher p_m=Pwdptrn.matcher(pwd);
	if(m.matches()) {
		System.out.println("Valid email Id");
	}
	else
		System.out.println("Invalid Valid email Id");
	
	
	if(p_m.matches())
	{
		System.out.println("Valid Password");
		
	}
	else
		System.out.println("Invalid Password");


	}
}
