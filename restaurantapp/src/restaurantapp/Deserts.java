package restaurantapp;

import java.util.Scanner;

public class Deserts {
	static int iceCreamTotal;
	static int ladduTotal;
	static int pastryTotal;
	public void desert() {
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
		System.out.println("***   Menu   			  ***");
		System.out.println("***   1.IceCream  		  ***");
		System.out.println("***   2.Laddu		  ***");
		System.out.println("***   3.Pastry  ***");
		System.out.println("***   4. Back			  ***");
		System.out.println("enter Your Choice");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
		{
		int price =50;
		System.out.println("Enter number of orders");
		int noplate=sc.nextInt();
		iceCreamTotal= price* noplate;
		RestaurantClient.totalBill = RestaurantClient.totalBill+iceCreamTotal;
		break;
		}
		
		case 2:
		{
		int price =15;
		System.out.println("Enter number of orders");
		int noplate=sc.nextInt();
		ladduTotal= price* noplate;
		RestaurantClient.totalBill = RestaurantClient.totalBill+ladduTotal;
		break;
		}
		case 3:
		{
		int price =35;
		System.out.println("Enter number of orders");
		int noplate=sc.nextInt();
		pastryTotal= price* noplate;
		RestaurantClient.totalBill = RestaurantClient.totalBill+pastryTotal;
		break;
		}
		case 4:
		{
			RestaurantClient.main(null);
			break;
			
		}
		default:
		{
			System.out.println("enter valid choice");
			break;
		}
	
		
	}
	}
	}
}
