package Encapsulation_casestudy;
import java.util.Scanner;
public class Encapsulation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		Student st=new Student();
		System.out.println("Enter the name:");
		st.setName(s.next());
		System.out.println("Enter the Id:");
		st.setId(s.nextInt());
		System.out.println("Name :"+st.getName());
		System.out.println("Id :"+	st.getId());
	
		
		
		
		

	}

}
