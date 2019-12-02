package String;

import java.util.Scanner;

public class string_vs_stringbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		//String can't concatenate 
		String st=new String("Govind");
		st.concat("jjsf");
		System.out.println(st);
		//concatenate the strings
		StringBuffer sb=new StringBuffer("haii");
		sb.append(" anu");
		System.out.println(sb);
		
		StringBuilder sb1=new StringBuilder("hello");
		sb1.append(" face");
		System.out.println(sb1);
	}

}
