package bankapp;

import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		int balance =10000;
		Scanner sc = new Scanner(System.in);
		while(true)
		{
		System.out.println("***   Menu   			  ***");
		System.out.println("***   1.Deposit   		  ***");
		System.out.println("***   2.with Draw		  ***");
		System.out.println("***   3. Balance Enquiry  ***");
		System.out.println("***   4. Exit			  ***");
		System.out.println("enter Your Choice");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
		{
			System.out.println("enter the amount");
			balance = balance + sc.nextInt();
			System.out.println("Amount Deposited Succesfully");
			System.out.println("Your Current Balance :" + balance);
			break;
			
		}
		case 2:
		{
			System.out.println("enter the amount");
			int amount = sc.nextInt();
			if (balance >= amount)
			{
			balance = balance - amount;
			System.out.println("Amount Withdrawn Succesfully");
			System.out.println("Your Current Balance :" + balance);
			}
			else
			{
				System.out.println("Insufficient Funds");
			}
			break;
		}
		
		case 3:
		{
			System.out.println("Your Current Balance :" +balance);
			break;
		}
		case 4:
		{
			System.out.println("THANK YOU");
			System.exit(0);
			break;
		}
		default:
		{
			System.out.println("Enter Valid Choice");
		}
		
		}//end of switch

		}//end of while
	}
}
