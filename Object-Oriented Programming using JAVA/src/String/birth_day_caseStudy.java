package String;

import java.util.Scanner;

public class birth_day_caseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the pasha's String :");
		String str=s.nextLine();
		System.out.println("Enter the number of days :");
		int days=s.nextInt();
		System.out.println("Enter the position from which pasha started transforming :");
		int start=s.nextInt();
		int end=s.nextInt();
		String myName = str;
		String newName = myName.substring(start,end)+'x'+myName.substring(5);
      
	}

}
