package String;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class String_casestudy_concat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the guest name:");
	String s1=s.nextLine();
	
	System.out.println("Enter the name of residence host:");
	String s2=s.nextLine();
	String c=s1.concat(s2);
	char m[]=c.toCharArray();
	Arrays.sort(m);
	System.out.println(m);
	String Str=new String(m);
			
	System.out.println("Enter the name2:");
	String  c1=s.next();
	char m1[]=c1.toCharArray();
	Arrays.sort(m1);
	System.out.println(m1);
	String Str1=new String(m1);
	if(Str.equals(Str1))
	{
		System.out.println("Yes");
		
	}
	else
		System.out.println("No");
	
	}}

	
	
	
	
	
	
	
	/*
	
	
	
	
//	StringBuffer  s1=new StringBuffer(s.nextLine());
//	System.out.println("Enter the name of residence host:");
//	StringBuffer  s2=new StringBuffer(s.nextLine());
//
//	StringBuffer b4=new StringBuffer();
//	s2=s1.append(s2);
//	System.out.println(s2);
	
	
	
	}

}

*/