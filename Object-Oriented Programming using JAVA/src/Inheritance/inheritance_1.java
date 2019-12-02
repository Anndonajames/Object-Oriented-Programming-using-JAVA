package Inheritance;
import java.util.Scanner;
import java.util.Scanner;
public class inheritance_1 {
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
		     System.out.println("CGPA");
		     cgpa=cs.getCgpa(s.nextDouble());
		     System.out.println("year");
		    year=cs.getYear(s.nextInt());
		    System.out.println("The Student Details is");
		    System.out.println("ID : "+idNum);
		    System.out.println("Name : "+name);
		    System.out.println("Age : "+age);
		    System.out.println("Gender : "+gender);
		    System.out.println("Major  : "+major);
		    System.out.println("CGPA : "+cgpa);
		    System.out.println("Year : "+year);
		    
		  }
		}
		
		 class CollegeStudent
		 {

			public String getName(String name) {
				// TODO Auto-generated mthod stub
				return name;
			}

			public Double getCgpa(Double cgpa) {
				// TODO Auto-generated method stub
				return cgpa;
			}

			public int getIdNum(int id) {
				// TODO Auto-generated method stub
				return id;
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


