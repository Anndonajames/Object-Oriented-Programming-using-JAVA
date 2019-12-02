package Encapsulation_casestudy;
import java.util.Scanner;
public class Casestudy1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		Customer c=new Customer();
		Display d= new Display();
		System.out.println("Registraion");
		System.out.println("Enter Your Name");
		c.setName(s.next());
		System.out.println("Enter Your Address");
		c.setAddress(s.next());
		System.out.println("Enter Your Contact Number");
		c.setContactNumber(s.next());
		System.out.println("Enter Your E-Mail Id");
		c.setEmail(s.next());
		System.out.println("Enter Your Proof Type");
		c.setProofType(s.next());
		System.out.println("Enter Your Proof ID");
		c.setProofID(s.next());
		//c.Register(c.getName(),c.getAddress(),c.getContactNumber(),c.getEmail(),c.getProofType(),c.getProofID());
		
		d.display(c.getName(),c.getAddress(),c.getContactNumber(),c.getEmail(),c.getProofType(),c.getProofID());
	}

}
