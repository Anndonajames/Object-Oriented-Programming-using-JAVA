package String;
import java.util.Scanner;
public class month {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the date(eg:25/12/2010)");
		String date=s.next();
		System.out.print(date);
		String d=""+date.charAt(3)+date.charAt(4);
		System.out.print(d);
		switch(d) {
		case "01":
			System.out.print("Jan");
			break;
		case "02":
			System.out.print("feb");
			break;
		case "03":
			System.out.print("March");
			break;
		case "04":
			System.out.print("April");
			break;
		case "05":
			System.out.print("May");
			break;
		case "06":
			System.out.print("June");
			break;
		case "07":
			System.out.print("July");
			break;
		case "08":
			System.out.print("August");
			break;
		case "09":
			System.out.print("September");
			break;
		case "10":
			System.out.print("October");
			break;
		case "11":
			System.out.print("November");
			break;
		case "12":
			System.out.print("December");
			break;
		default:
			System.out.print("invalid");
			break;
		}
		
		
		
	}

}
