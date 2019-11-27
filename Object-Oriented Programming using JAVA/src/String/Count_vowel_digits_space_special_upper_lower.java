package String_programs;

import java.util.Scanner;

public class Count_vowel_digits_space_special_upper_lower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		package String;

		import java.util.Scanner;

		public class flames_cal {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Scanner sc=new Scanner(System.in);
				String str=sc.nextLine();
				int len=str.length();
				int vcount=0,ccount=0,icount=0,scount=0,ucount=0,lcount=0;
				for(int i=0;i<len;i++)
				{
				char ch=str.charAt(i);
				if(ch=='A' || ch=='a' || ch=='E' || ch=='e' ||ch=='I'|| ch=='i'|| ch=='O' || ch=='o' || ch=='U' || ch=='u')
				{
				vcount=vcount+1;
				}
				else
				{
				ccount=ccount+1;
				}
				if(ch>0 && ch<10)
				{
				icount=icount+1;
				}
				if(ch>'A' && ch<'Z')
				{
				ucount=ucount+1;
				}
				if(ch>'a' && ch<'z')
				{
				lcount=lcount+1;
				}
				else
				{
				scount=scount+1;
				}

				}
				System.out.printf("vcount: %d",vcount);
				System.out.printf("\nccount: %d",ccount);
				System.out.printf("\nicount: %d",icount);
				System.out.printf("\nscount: %d",scount);
				System.out.printf("\nucount: %d",ucount);
				System.out.printf("\nlcount: %d",lcount);
				}

		}