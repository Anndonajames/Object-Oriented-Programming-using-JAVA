package String;

import java.util.Scanner;

public class Keyboard_blind_casestudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	StringBuilder c=new StringBuilder();
	String st="qwertyuiop asdfghjkl; zxcvbnm,./";
	char chr[]=st.toCharArray();
	System.out.println("Enter a character");
	        char ch=s.next().charAt(0);
	        System.out.println("Enter the string");
	        String str=s.next();
	        char charq[]=str.toCharArray();
	        System.out.println("The original message");
	        for(int i=0;i<str.length();i++)
	        {
	        char chrr=str.charAt(i);
	        for(int j=0;j<chr.length;j++)	
	        {
	        if(charq[i]==(chr[j])&&ch=='R')
	        {
	        c.append(chr[j-1]);
	        }
	        if(charq[i]==(chr[j])&&ch=='L')
	        {
	        c.append(chr[j+1]);	
	        }	
	        }
	        }
	        System.out.println(c);
	}

	}