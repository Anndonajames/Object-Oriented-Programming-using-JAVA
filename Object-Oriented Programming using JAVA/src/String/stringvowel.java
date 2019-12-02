package String;
import java.util.Scanner;
public class stringvowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	System.out.print("Enter the size");
	int num=s.nextInt();
	int i,j;
	char c;
	//System.out.print(num);
	String a[]=new String[num] ;
	
			System.out.print("Enter the words");
			for(i=0;i<num;i++)
			{
			a[i]=s.next();
			}
	for(j=0;j<num;j++)
	{
		c=a[j].charAt(0);
		
		if(c=='a' || c=='e' ||c=='i'|| c=='o' || c=='u' ||c=='A' || c=='E' ||c=='I'|| c=='O' || c=='U')
		{
			System.out.println(a[j]);
		}
	}
	s.close();
	}

}
