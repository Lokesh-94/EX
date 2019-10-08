package restaurantapp;

import java.util.Scanner;

public class Drinks {
	static int sdTotal;
	static int hdTotal;
	public void drink() {
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("***   Menu   			  ***");
		System.out.println("***   1.SoftDrinks 		  ***");
		System.out.println("***   2.Hot Drinks		  ***");
		System.out.println("***   3.Back			  ***");
		System.out.println("Enter Your Choice");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
		{
			int price =45;
			System.out.println("Enter number of orders");
			int noplate=sc.nextInt();
			sdTotal= price* noplate;
			RestaurantClient.totalBill = RestaurantClient.totalBill+sdTotal;
			break;
		}
		case 2:
		{
			int price =25;
			System.out.println("Enter number of orders");
			int noplate=sc.nextInt();
			hdTotal= price* noplate;
			RestaurantClient.totalBill = RestaurantClient.totalBill+hdTotal;
			break;
		}
		case 3:
		{
			RestaurantClient.main(null);
			break;
		}
		default:
		{
			System.out.println("Enter Valid Choice");
			break;
		}
		}
	}

}
}
