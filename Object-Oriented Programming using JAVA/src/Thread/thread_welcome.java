package Thread;

import java.util.Scanner;

 class Print_hello extends Thread
{
	 public void run()
	 {
	Scanner s=new Scanner(System.in);
	String str=s.next();
	int i;
	int len=str.length();
	for(i=0;i<len;i++)
	{
		try {
		char c =str.charAt(i);
		System.out.println(c);
		Thread.sleep(1000);
		
	}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	
}
}

}
public class thread_welcome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Print_hello p=new Print_hello();
		p.start();
	}

}

