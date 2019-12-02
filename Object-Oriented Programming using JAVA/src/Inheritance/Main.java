package Inheritance;
import java.util.*;
		class Main
		{
		  public static void main(String args[])
		  {
		    //type your code here
		    Scanner s=new Scanner(System.in);
		    CollegeStudent cs=new CollegeStudent();
		    String name;
			String major;
		    Integer age,year;
		    String gender;
		    int idNum;
		    Double cgpa;
		    System.out.println("Name");
		    name=cs.getName(s.next());
		     System.out.println("Age");
		    age=cs.getAge(s.nextInt());
		     System.out.println("Gender");
		    gender=cs.getGender(s.next());
		     System.out.println("ID Number");
		    idNum=cs.getIdNum(s.nextInt());
		     System.out.println("Major");
		    major=cs.getMajor(s.next());
		     System.out.println("year");
		    year=cs.getYear(s.nextInt());
		  }
		}
		
		 class CollegeStudent
		 {

			public String getName(String name) {
				// TODO Auto-generated mthod stub
				return name;
			}

			public int getIdNum(int nextInt) {
				// TODO Auto-generated method stub
				return 0;
			}

			public String getMajor(String major) {
				// TODO Auto-generated method stub
				return major;
			}

			public String getGender(String gender) {
				// TODO Auto-generated method stub
				return gender;
			}

			public Integer getAge(int age) {
				// TODO Auto-generated method stub
				return age;
			}

			public Integer getYear(int year) {
				// TODO Auto-generated method stub
				return year;
			}

			
		 
		 }
		 