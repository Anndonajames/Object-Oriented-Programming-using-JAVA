package OOPS;
import java.util.Scanner;

public class Student_Details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String name,address;
		int sub1,sub2,sub3,sub4,sub5,total,avg,roll_Num;
		System.out.println("Student Details");
		System.out.println("Enter Your Name: ");
		name=s.nextLine();
		System.out.println("Enter Your Roll Number: ");
		roll_Num=s.nextInt();
		System.out.println("Enter Your Marks");
		System.out.println("Enter Mark1");
		sub1=s.nextInt();
		System.out.println("Enter Mark2");
		sub2=s.nextInt();
		System.out.println("Enter Mark3");
		sub3=s.nextInt();
		System.out.println("Enter Mark4");
		sub4=s.nextInt();
		System.out.println("Enter Mark5");
		sub5=s.nextInt();
		total=sub1+sub2+sub3+sub4+sub5;
		
		Student st=new Student(name,roll_Num,sub1,sub2,sub3,sub4,sub5);
		st.details();
		st.mark();
		
		System.out.println("Your Rank is :");
		int rank=st.rank();
		if(rank==0)
		{
			System.out.print("You are Failed");
		}
		else 
			System.out.print(rank);
		
		
		

		
	}

}
class Student 
{
	
	String name,address;;
	int sub1,sub2,sub3,sub4,sub5,total,avg,roll_Num;
	int rank;
	public Student(String name,int roll_Num,int sub1,int sub2,int sub3,int sub4,int sub5)
	{
		this.name=name;
		this.roll_Num=roll_Num;
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
		this.sub4=sub4;
		this.sub5=sub5;
	}
		
	  public void   details()
		{
		  
			System.out.println("Name: "+name);
			System.out.printf("Roll Number:",roll_Num);
			System.out.println("Mark1:"+sub1);
			System.out.println("Mark1:"+sub2);
			System.out.println("Mark1:"+sub3);
			System.out.println("Mark1:"+sub4);
			System.out.println("Mark1:"+sub5);
			
			
		}
	  public void mark()
	  {
		  total=sub1+sub2+sub3+sub4+sub5;
		  avg=total/5;
		  System.out.println("Total Marks:"+total);
		  System.out.println("Average:"+avg);	  
	  }
	  public int rank()
	  {
		  if(avg>90)
		  {
			  rank=1;
			  return rank;
		  }
		  if(avg>80 && avg<89  )
		  {
			  rank=2;
			 
		  }
		  if(avg>70 && avg<79  )
		  {
			  rank=3;
			  
		  }
		  if(avg>60 && avg<99  )
		  {
			  rank=3;
			  
		  }
		  if(avg>50 && avg<59  )
		  {
			  rank=3;
			  
		  }
		  
		  return rank;
		  
	  }
	  }
	  
		
	
