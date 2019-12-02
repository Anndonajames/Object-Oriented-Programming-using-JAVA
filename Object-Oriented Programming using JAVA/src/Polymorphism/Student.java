package Polymorphism;
import java.util.Scanner;
public class Student {
	int avg,tot;
	String rank;

public void details(String name) {
	// TODO Auto-generated method stub
	System.out.println("Name :"+name);
	
	
}

public void details(int roll,int year, String dept) {
	// TODO Auto-generated method stub
	System.out.println("Roll Number :"+roll);
	System.out.println("Year :"+year);
	System.out.println("Department :"+dept);
	
}

public void details(int m1, int m2, int m3, int m4, int m5) {
	// TODO Auto-generated method stub
	tot=m1+m2+m3+m4+m5;
	avg=tot/5;
	System.out.println("Total Mark Scored :"+tot);
	if(avg>90)
	{
		System.out.println("Rank 1");
	}
	else if(avg>70 && avg<89)
	{
		System.out.println("Rank 2");
	}
	else if(avg>60 && avg<79)
	{
		System.out.println("Rank 3");
	}
	else if(avg>50 && avg<69)
	{
		System.out.println("Rank 4");
	}
	else
		System.out.println("You are Failed");
			
}

public void display(String name) {
	// TODO Auto-generated method stub
	
}


}


















































//public void sum(int a) {
//int s=a;
//System.out.println("Sum1    :" + s);
//
//}
//public void sum(int a,int b) {
//int s=a+b;
//System.out.println("Sum2    :" + s);
//
//}
//public void sum(int a,int b,int c) {
//int s=a+b+c;
//System.out.println("Sum3    :" + s);
//
//}