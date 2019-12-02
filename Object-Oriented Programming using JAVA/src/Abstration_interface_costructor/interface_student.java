package Abstration_interface_costructor;
import java.util.Scanner;
public class interface_student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface_eg st=new Interface_eg();
		Scanner s=new Scanner(System.in); 
		int tot,avg;
		System.out.println("Enter the name:");
		String name=s.next();
		System.out.println("enter roll number");
		int roll=s.nextInt();
		System.out.println("enter Marks");
		System.out.println("Enter mark1");
		int m1=s.nextInt();
		System.out.println("Enter mark2");
		int m2=s.nextInt();
		System.out.println("Enter mark3");
		int m3=s.nextInt();
		System.out.println("Enter mark4");
		int m4=s.nextInt();
		System.out.println("Enter mark5");
		int m5=s.nextInt();
		st.details(name,roll);
		st.totalmark(m1,m2,m3,m4,m5);
		
	}
	}
 class Interface_eg implements Parent1,Parent2 {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
	 int tot,avg;
		
		public void details(String name,int roll)
		{
			System.out.println("Name :"+name);
			System.out.println("Roll Number :"+roll);
		}
		
		public void totalmark(int m1,int m2,int m3,int m4,int m5)
		{
			tot=m1+m2+m3+m4+m5;
			avg=tot/5;
			System.out.println("Total Score: "+tot);
			System.out.println("Average: "+avg);
			if(avg>=90)
			{
				System.out.println("Rank 1");
			}
			if(avg>70 && avg<89)
			{
				System.out.println("Rank 2");
			}
			if(avg>50 && avg<69)
			{
				System.out.println("Rank 3");
			}
			else
				System.out.println("You are failed");
			
		}
		

//	}

}
interface  Parent1
{
		public void totalmark(int m1,int m2,int m3,int m4,int m5);
		
	
}

interface Parent2   
{
	public void details(String name,int roll);
}
	