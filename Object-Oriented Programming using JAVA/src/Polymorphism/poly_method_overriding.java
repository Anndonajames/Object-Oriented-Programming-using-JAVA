package Polymorphism;
import java.util.Scanner;
public class poly_method_overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Your Name");
	String name=s.next();
	System.out.println("Enter your College Name");
	String c_name=s.next();
	System.out.println("Enter your Department Name");
	String d_name=s.next();
	Overriding_student st=new Overriding_student();
	B b=new B();
	A a=new A();
	st.display(name);
	b.display(c_name);
	a.display(d_name);
	
	

	}

}
