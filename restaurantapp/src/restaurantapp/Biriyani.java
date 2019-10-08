package restaurantapp;

import java.util.Scanner;

public class Biriyani {
	static int mbTotal;
	static int cbTotal;
	static int sbTotal;
	public void biriyani() {
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
		System.out.println("***   Menu   			  ***");
		System.out.println("***   1.Mutton  		  ***");
		System.out.println("***   2.Chicken		  ***");
		System.out.println("***   3.Shrimp    ***");
		System.out.println("***   4. Back			  ***");
		System.out.println("enter Your Choice");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
		{
			int price =350;
			System.out.println("Enter number of orders");
			int noplate=sc.nextInt();
			mbTotal= price* noplate;
			RestaurantClient.totalBill = RestaurantClient.totalBill+mbTotal;
			break;
			}
		case 2:
		{
			int price =150;
			System.out.println("Enter number of orders");
			int noplate=sc.nextInt();
			cbTotal= price* noplate;
			RestaurantClient.totalBill = RestaurantClient.totalBill+cbTotal;
			break;
			}
		case 3:
		{
			int price =250;
			System.out.println("Enter number of orders");
			int noplate=sc.nextInt();
			sbTotal= price* noplate;
			RestaurantClient.totalBill = RestaurantClient.totalBill+sbTotal;
			break;
		}
		case 4:
		{
			RestaurantClient.main(null);
			break;
		}
		default:
		{
			System.out.println("enter vaid choice");
			break;
		}
}
		}
	}
}
