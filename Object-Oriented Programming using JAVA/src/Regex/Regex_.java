package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Regex_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		Pattern p=Pattern.compile(".s");
		Matcher m=p.matcher("as");
		Boolean b=m.matches();
		System.out.println(b);
		
	}

}
