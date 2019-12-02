package Polymorphism_caseStudy;
import java.util.Scanner;
public class Encapsulation_casestudy_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	Ticket obj=new Ticket();
	Ticket obj1=new Ticket();
	System.out.println("Enter price of a ticket:");
	
	obj.setPrice(s.nextInt());
	System.out.println("Enter Number of Persons");
	obj.setNo_persons(s.nextInt());
	obj.addPerson();
	obj.display();
	
	
	//obj.calculate(obj.getPrice(),);
	}

}

class Ticket 
{
	Scanner s=new Scanner(System.in);
	public int passenger_count;
	static int totalamount;
	int ticket,no_persons,age,price;
	public double discount,total_amount,discount2,d;
	String name,gender;
	public int a;
	double pr;
	
	void addPerson()
	{
	//	t.passenger_count++;
	//	t.totalamount++;
		 a=getNo_persons();
		pr=getPrice();
		for(int i=0;i<a;i++)
		{
		System.out.println("Enter Details for Person"+i+1+":");
		System.out.println("Name:");
		setName(s.next());
		System.out.println("Gender:");
		setGender(s.next());
		System.out.println("Age:");
		setAge(s.nextInt());
		calculate(pr);
		//d=d+discount2;
		//System.out.println(d);
		//System.out.println("jnjhj");
		
		
		
	}
	}

	public int getPassenger_count() {
		return passenger_count;
	}

	public void setPassenger_count(int passenger_count) {
		this.passenger_count = passenger_count;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getTotalamount() {
		return totalamount;
	}

	public void setTotalamount(int totalamount) {
		this.totalamount = totalamount;
	}

	public int getTicket() {
		return ticket;
	}

	public void setTicket(int ticket) {
		this.ticket = ticket;
	}

	public int getNo_persons() {
		return no_persons;
	}

	public void setNo_persons(int no_persons) {
		this.no_persons = no_persons;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	public double calculate(double pr)
	{
		//System.out.println("bhjhbujhujhbjbjann1");
		if(age<16)
		{
			System.out.println("bhjhbujhujhbjbjann2");
			discount=pr*(50/100);
			
			//System.out.println("Discount"+discount);
		}
		if(age>64)
		{
			System.out.println("bhjhbujhujhbjbjann3");
			discount=pr*(25/100);
			
			//System.out.println("Discount"+discount);
			
		}
		if(gender.equals("female"))
		{
			System.out.println("bhjhbujhujhbjbjann4");
			discount=pr*(10/100);
			
			System.out.println("Discount"+discount);
		}
		if(gender.equals("male"))
		{
			System.out.println("bhjhbujhujhbjbjann5");
			discount=0;
			
			//System.out.println("Discount"+discount);
		}
		return discount;
		
		}
	public void display()
	{
		
		
		total_amount=(a*price);
		System.out.println("Ticket Details are:");
		System.out.println("Number of Passengers :"+a);
		System.out.println("Price of a ticket :"+price);
		System.out.println("Total Amount :"+total_amount);
		
		
	}
	
}