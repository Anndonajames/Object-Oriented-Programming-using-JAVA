package Encapsulation;

public class Customer_c {
		String name,address,contactNumber, email, proofType,proofID;
		static int id=1;

		public String getName() {
			return name;
		}

		public boolean setName(String name) {
			//this.name = name;
			if(name.matches("^[a-zA-Z]*$"))
			{
				this.name=name;
				return true;
				
			}
			else 
				return false;
			
		}

		public String getAddress() {
			return address;
		}

		public boolean setAddress(String address) {
			//this.address = address;
			if(address.matches("^[a-zA-Z0-9]*$"))
			{
				this.address=address;
				return true;
			}
			else
				return false;
				
		}

		public String getContactNumber() {
			return contactNumber;
			
		}

		public boolean setContactNumber(String contactNumber) {
			//this.contactNumber = contactNumber;
			 if (contactNumber.matches("^[0-9]*$"))
	            {
	                this.contactNumber=contactNumber;
	                return true;
	            }
	            else
	            {
	                
	                return false;
	            }
		}

		public String getEmail() {
			return email;
		}

		public boolean setEmail(String email) {
			//this.email = email;
			 if (email.contains("@"))
	            {
	                this.email=email;
	                return true;
	            }
	            else
	            {
	               
	                return false;
	            }
			
			
		}

		public String getProofType() {
			return proofType;
		}

		public boolean setProofType(String proofType) {
			//this.proofType = proofType;
			if(proofType.matches("^[a-zA-Z]*$"))
			{
				this.proofType=proofType;
				return true;
			}
				else
	            {
	               
	                return false;
	            }
		}

		public String getProofID() {
			return proofID;
		}

		public boolean setProofID(String proofID) {
			//this.proofID = proofID;
			if(proofID.matches("^[0-9]*$"))
			{
				this.proofID=proofID;
				return true;
			}
				else
	            {
	                return false;
	            }
			
		}
	

	public void Register(String name, String address, String contactNumber, String email, String proofType,
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

	public void check(boolean a, boolean b, boolean cc, boolean d, boolean e, boolean f) {
		
		
		if(!a || !b || !cc || !d || !e || !f)
		{
			
			if(!a)
			{
				
				System.out.println("Invalid name");
			}
			if(!b)
			{
				
				System.out.println("Invalid address");
			}
			if(!cc)
			{
				
				System.out.println("Invalid  Contact Number");
			}
			if(!d)
			{
				
				System.out.println("Invalid  email");
			}
			if(!e)
			{
				
				System.out.println("Invalid  Proof type");
			}
			if(!f)
			{
				
				System.out.println("Invalid  Proof id");
			}
		System.out.println("Registration Failed");
			
		}
		else
			System.out.println("Registration Sucessfull");
		if(a && b && cc && d && e && f)
		{
		Register(getName(),getAddress(),getContactNumber(),getEmail(),getProofType(),getProofID());
		}
	}
	
		
		
	}


