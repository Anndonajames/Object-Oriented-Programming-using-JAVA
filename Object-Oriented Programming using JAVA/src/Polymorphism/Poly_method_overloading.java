package Polymorphism;
import java.util.Scanner;
public class Poly_method_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	
	System.out.println("Enter Student Name :");
	String name=s.nextLine();
	System.out.println("Enter Roll Number:");
	int roll=s.nextInt();
	System.out.println("Enter Year:");
	int year=s.nextInt();
	System.out.println("Enter Department:");
	String dept=s.next();
	System.out.println("Enter Marks");
	System.out.println("Enter Mark1");
	int m1=s.nextInt();
	System.out.println("Enter Mark2");
	int m2=s.nextInt();
	System.out.println("Enter Mark3");
	int m3=s.nextInt();
	System.out.println("Enter Mark4");
	int m4=s.nextInt();
	System.out.println("Enter Mark5");
	int m5=s.nextInt();
	Student A=new Student();
	A.details(name);
	A.details(roll,year,dept);
	A.details(m1,m2,m3,m4,m5);
	//A.details();
	}

}
