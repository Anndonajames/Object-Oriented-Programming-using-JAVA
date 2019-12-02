package Polymorphism;
import java.util.Scanner;
public class Overriding_student extends B  {

	public void display(String name) {
		// TODO Auto-generated method stub
		
		System.out.println("Name"+name);
		//super.display();
		
	}
}
 class B extends A
{
	public void display(String c_name) {
		// TODO Auto-generated method stub
		
		System.out.println("College Name"+c_name);
	}
}
 class A
{
	public void display(String d_name) {
		// TODO Auto-generated method stub
		
		System.out.println("Name"+d_name);
	}

	public void display() {
		// TODO Auto-generated method stub
		
	}
}