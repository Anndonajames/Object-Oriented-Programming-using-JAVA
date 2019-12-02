package Encapsulation;
import java.util.Scanner;

import Display;
public class Customer extends Display {
	String name,address,contactNumber, email, proofType,proofID;
	static int id=1;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getProofType() {
		return proofType;
	}

	public void setProofType(String proofType) {
		this.proofType = proofType;
	}

	public String getProofID() {
		return proofID;
	}

	public void setProofID(String proofID) {
		this.proofID = proofID;
	}

/*	public void Register(String name, String address, String contactNumber, String email, String proofType,
			String proofID) {
		
		// TODO Auto-generated method stub
		System.out.println("Name :"+name);
		System.out.println("Address :"+address);
		System.out.println("Contact Number :"+contactNumber);
		System.out.println("Email Id :"+email);
		System.out.println("Proof Type :"+proofType);
		System.out.println("Proof Id :"+proofID);
		
		
		System.out.println("Thank You For Registering your id is"+id);
		
	}
	*/
	
}

