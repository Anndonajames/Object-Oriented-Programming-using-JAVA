package Encapsulation_casestudy;
import java.util.Scanner;
public class Encapsulation_casestudy_4 {
			public static void main(String[] args) {
				// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			Ticket_1 obj=new Ticket_1();
			System.out.println("Enter Price of a ticket :");
			obj.setPrice(s.nextInt());
			System.out.println("Enter Number of Persons :");
			obj.setP(s.nextInt());
			int personcount=obj.getP();
			int x=personcount;
			int i=1,k=1,j=1;
			int num=personcount;
			
			String name[]=new String[25];
			String gender[]=new String[25];
			int age[]=new int[5];
			for(i=0;i<num;i++)
			{
			System.out.printf("Enter Details for Person %d :\n",j);
			j++;
			System.out.println("Name:");
			obj.setName(s.next());
			name[i]=obj.getName();
			System.out.println("Gender (M or F) :");
			obj.setGender(s.next());
			gender[i]=obj.getGender();
			System.out.println("Age :");
			obj.setAge(s.nextInt());
			age[i]=obj.getAge();
			
			}

			obj.ticket(obj.getP(),obj.getPrice());
			while(num<=obj.getP())
			{

			double total=obj.ticket1(obj.getAge(),obj.getGender(),obj.getP(),obj.getPrice());
			if(num==obj.getP()) {
			System.out.printf("Total Amount=%.1f",total);
			break;
			}
			num++;
			}
			System.out.println("\n Passenger Details:\n");
			int q=1;
			for(i=0;i<num;i++)
			{
				System.out.printf("%d) %s (%s %d) \n",q,name[i],gender[i],age[i]);
				q++;
			}
			}

}

		class Ticket_1
		{
			Scanner s=new Scanner(System.in);
			int price;
			int p;
			String name;
			String gender;
			int age;
			int i=1,j=0;
			double total=0,sum=0;
			//public String name1[];
			public int getI() {
			return i;
			}
			
			public void setI(int i) {
			this.i = i;
			}
			public int getPrice() {
			return price;
			}
			public void setPrice(int price) {
			this.price = price;
			}
			public int getP() {
			return p;
			}
			public void setP(int p) {
			this.p = p;
			}
			public String getName() {
			return name;
			}
			public void setName(String name) {
			this.name = name;
			}
			public String getGender() {
			return gender;
			}
			public void setGender(String gender) {
			this.gender = gender;
			}
			public int getAge() {
			return age;
			}
			public void setAge(int age) {
			this.age = age;
			}
			public void ticket(int p,int price)
			{
			System.out.println("Ticket Details are .....\n");
			System.out.printf("No. of Passengers :%d\n",p);
			System.out.printf("Price of a ticket   :%d\n",price);
			
			}
			double ticket1(int age,String gender,int p,int price)
			{
			int x=0;
//			String g_ender[x]=gender;
//			x++;
			j++;total=0;
			double m=.25,o=.10,q=.50;
			if(age<16)
			{
			total=(double)sum+(price-(price*q));
			sum=total;
			return total;
			}
			else if(gender.contentEquals("F")==true&&age>=16)
			{
			total=sum+(price-price*o);
			sum=total;
			return total;
			}
			else if(age>64)
			{
			total=sum+(price-price*m);
			sum=total;
			return total;
			}
			else
			{
			total=sum+price;
			sum=total;
			return total;
			}

			}
		}
		
