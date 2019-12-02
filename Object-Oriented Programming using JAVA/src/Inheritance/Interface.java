package Inheritance;
import java.util.Scanner;

public class Interface {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			Account ac=new Account();
			System.out.println("1.Current Account\n2.Savings Account");
			int op=s.nextInt();
			String name,s_date;
			int account_num,balance,years;
			System.out.println("Name");
			name=s.next();
			System.out.println("Account Number");
			account_num=s.nextInt();
			System.out.println("Account Balance");
			balance=s.nextInt();
			System.out.println("Enter the Start Date(yyyy-mm-dd)");
			s_date=s.next();
			System.out.println("Enter the Years");
			years=s.nextInt();
			CurrentAccount ca=new CurrentAccount();
			SavingsAccount sa=new SavingsAccount();
			switch(op)
			{
				case 1:
					ca.computeMaintanaceCharge(years);
					
					break;
				case 2:
					sa.computeMaintanaceCharge(years);
					
			}

		}

	}
	 class Account
	{	
	}
	class CurrentAccount extends Account implements MaintanaceCharge
	{
		double maintenance_amt1;
		@Override
		public void   computeMaintanaceCharge(int years) {
			// TODO Auto-generated method stub
			maintenance_amt1=(100*years)+200; 	; 	
			System.out.printf("Maintainence Charge For Current Account %.2f",maintenance_amt1);
		}
	}
	class SavingsAccount extends Account implements MaintanaceCharge
	{
		double maintenance_amt2;
		public void  computeMaintanaceCharge(int years)
		{
			// TODO Auto-generated method stub
			maintenance_amt2=(2*50*years)+50; 	
			System.out.printf("Maintainence Charge For Savings Account %.2f",maintenance_amt2);
		}
	}

	interface MaintanaceCharge
	{
		public void computeMaintanaceCharge(int years);
	}
