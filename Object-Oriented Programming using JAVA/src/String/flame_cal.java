package String;

import java.util.Scanner;

public class flame_cal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the name 1 :");
		String name1=s.nextLine();
		System.out.println("Enter the name 2 :");
		String name2 =s.nextLine();
	    String s1 = name1;
	    String s2 = name2;
	    for (int i = 0; i < name1.length(); i++) {
	        for (int j = 0; j < name2.length(); j++) {
	            if (name1.charAt(i) == name2.charAt(j)) {
	            name1 = name1.replaceFirst(String.valueOf(name1.charAt(i)), "#");
	            name2 = name2.replaceFirst(String.valueOf(name2.charAt(j)), "#");
	            }
	        }
	    }
	    String result = name1 + name2;
	    result = result.replaceAll("#", "");
	    int resultLength = result.length();
	    String flames = "flames";
	    char r = 0;
	    int temp = 0;
	    if (resultLength > 0) {
	        temp = resultLength % flames.length();
	    }
	    if (temp == 0 && resultLength >= 6) {
	        r = 's';
	    } else {
	        int count = temp - 1;
	        if (count >= 0) {
	            r = flames.charAt(count);
	        System.out.println("Relation Between " + s1 + " and " + s2 + " is:");
	        }
	    }
	    switch (r) {
	        case 'f':
	            System.out.println("friendship");
	            break;
	        case 'l':
	            System.out.println("Lovers");
	            break;
	        case 'a':
	            System.out.println("Affection");
	            break;
	        case 'm':
	            System.out.println("Marriage");
	            break;
	        case 'e':
	            System.out.println("Enemity");
	            break;
	        case 's':
	            System.out.println("Siblings");
	            break;
	        default:
	            System.out.println("100% Love");
	            break;
	    }
	}

	}


