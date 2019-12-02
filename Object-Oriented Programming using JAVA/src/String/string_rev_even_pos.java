package String;

import java.util.Scanner;

public class string_rev_even_pos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String  strspilt[]=str.split(" ");
		int len=strspilt.length;
		int i,j;

		
		for(i=0;i<len;i++)
		{
			if(i%2!=0)   // to take odd  position strings
			{
				int l=strspilt[i].length();//length of each words in odd position
			for(j=l-1;j>=0;j--)
			
				
			{
				System.out.print(strspilt[i].charAt(j));//take  odd position values and and reverse it
			}
					System.out.print(" ");		
			}
			else
				System.out.print(strspilt[i]+" ");
				
		}
		

	}

}