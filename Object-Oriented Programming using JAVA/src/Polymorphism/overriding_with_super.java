package Polymorphism;
import java.util.Scanner;
public class overriding_with_super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		Demo obj=new Demo();
		obj.display();
		

	}

}

class Demo extends AB
{

	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("Good Evening");
	}
	
}
class AB
{

	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Good Morning");
	}
	
}