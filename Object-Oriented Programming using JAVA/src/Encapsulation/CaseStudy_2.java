package Encapsulation;
import java.util.Scanner;

import Customer_c;
public class CaseStudy_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		Customer_c c=new Customer_c();
		
		System.out.println("Registraion");
		System.out.println("Enter Your Name");
		boolean a=c.setName(s.next());
		System.out.println("Enter Your Address");
		boolean b=c.setAddress(s.next());
		System.out.println("Enter Your Contact Number");
		boolean cc=c.setContactNumber(s.next());
		System.out.println("Enter Your E-Mail Id");
		boolean d=c.setEmail(s.next());
		System.out.println("Enter Your Proof Type");
		boolean e= c.setProofType(s.next());
		System.out.println("Enter Your Proof ID");
		boolean f=c.setProofID(s.next());
		//c.Register(c.getName(),c.getAddress(),c.getContactNumber(),c.getEmail(),c.getProofType(),c.getProofID());
		c.check(a,b,cc,d,e,f);
		
		
		//d.display(c.getName(),c.getAddress(),c.getContactNumber(),c.getEmail(),c.getProofType(),c.getProofID());
	}
}
