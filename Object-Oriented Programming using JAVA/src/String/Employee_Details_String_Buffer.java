package String;

import java.io.BufferedReader;
import java.nio.Buffer;
import java.util.Scanner;

class Employee_Details_String_Buffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	StringBuffer sr=new StringBuffer();
	System.out.println("Enter the Employee Id");
	sr.append("Employee Id : "+s.nextLine()+"\n");
	System.out.println("Enter the Name:");
	sr.append("Name :" +s.nextLine()+"\n");
	System.out.println("Enter the salary :");
	sr.append("Salary :"+s.nextLine()+"\n");
	System.out.println("Employee Details:");
	System.out.println(sr);

	
	
	
	
	
	
	
	
	
	
//	StringBuffer emp_id=new StringBuffer(s.nextLine());
//	StringBuffer name=new StringBuffer(s.nextLine());
//	StringBuffer salary=new StringBuffer(s.nextLine());
//	System.out.println();
//	System.out.println();
//	System.out.println("Employee Id"+emp_id);
//	System.out.println("Name :"+name);
//	System.out.println("Salary :"+salary);
	}
}
