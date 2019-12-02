package String;

import java.util.Scanner;

public class String_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	//String str1=s.nextLine();
	String str1=new String("Hello World");
	//length
	int len=str1.length();
	System.out.println("Length of the string :"+len);
	//char At

	char c=str1.charAt(6);
	System.out.println("Character is "+c);
	
	//index of string/char
	int index=str1.indexOf("World");
	System.out.println("index :" +index);
	
	//replace with new word
	String repl=str1.replace("Hello","Little");
	System.out.println("Replace: "+repl);
	
	//split words in string
	
	String splitarr[]=str1.split(" ");
	
	System.out.print("Split :");
	for(int i=0;i<splitarr.length;i++)
	{
		System.out.println(splitarr[i]);
	}

	
	//SubString 
	String substr=str1.substring(2,5);
	System.out.println("Sub String : "+substr);
	
	//Equals method
	String str2="abcd";
	boolean eq=str1.equals(str2);
	System.out.println("String Equal or not : "+eq);
	
	//Concatenate two strings
	
	String concat=str1.concat(str2);
	System.out.println(" Concatenate two Strings "+concat);
	
	//Starts with a particular string or character
	boolean starts_with=str1.startsWith("H");
	System.out.println("Starts with(true/false) :"+starts_with);
	
	//To uppercase method
	String upper=str1.toUpperCase();
	System.out.println("Upper Case :"+upper);
	
	//To lowercase
	String lower=str1.toLowerCase();
	System.out.println("Lower Case :"+lower);
	
	
	
	
	
	
	
		
	
	
	}

}
