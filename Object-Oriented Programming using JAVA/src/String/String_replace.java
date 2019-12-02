package String;

import java.util.Scanner;

public class String_replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	String s1=s.nextLine();
	String s2=s.nextLine();
	String s3=s.nextLine();
	int l1,l2,l3,i;
	l1=s1.length();
	l2=s2.length();
	l3=s3.length();
	String a="";
	//char c[]=s2.toCharArray();
	
//	
		String string1 = s1.replaceAll("[AaEeIiOoUu]", "\\$");  //Replace vowels with star
	      String string2 = s2.replaceAll("[^(AaEeIiOoUu)+]", "#"); 
	      String string3=s3.toUpperCase();
	      String string4=string1.concat(string2);
	      String  string5=string4.concat(string3);
	      System.out.println(string5);
	      
	      
	
}}