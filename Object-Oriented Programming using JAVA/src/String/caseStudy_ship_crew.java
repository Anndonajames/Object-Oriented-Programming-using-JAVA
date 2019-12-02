package String;

import java.util.Scanner;

public class caseStudy_ship_crew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number of people in the crew :");
	int count=s.nextInt();
	System.out.println("Enter the name of the crew member and his status on the ship");
	int i;
	StringBuffer sb=new StringBuffer();
	for(i=0;i<count;i++)
	{
		
	sb.append(s.nextLine());
	
	}
	System.out.println(sb);
	}

}
