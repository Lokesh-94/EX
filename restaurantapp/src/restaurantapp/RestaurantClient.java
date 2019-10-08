package restaurantapp;

import java.util.Scanner;

public class RestaurantClient {
	static int totalBill=0;

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		while(true)
		{
		System.out.println("***   Menu   			  ***");
		System.out.println("***   1.Deserts  		  ***");
		System.out.println("***   2.Biriyani		  ***");
		System.out.println("***   3.Drinks  		  ***");
		System.out.println("***   4. bill			  ***");
		System.out.println("***   5.Exit			  ***");
		System.out.println("enter Your Choice");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
		{
			Deserts d = new Deserts();
			d.desert();
			break;
		}
		case 2:
		{
			Biriyani b= new Biriyani();
			b.biriyani();
			break;
		}
		case 3:
		{
			Drinks d= new Drinks();
			d.drink();
			break;
			}
		case 4:
		{
			if (Deserts.iceCreamTotal > 0)
			{
				
			System.out.println("ICE CREAM       : " +Deserts.iceCreamTotal);
			}
			if(Deserts.ladduTotal > 0  )
			{
			System.out.println("LADDU  	: " +Deserts.ladduTotal);
			}
			if(Deserts.pastryTotal > 0)
			{
			System.out.println("PASTRY     	: " +Deserts.pastryTotal);
			}
			if(Biriyani.mbTotal > 0)
			
			{
			System.out.println("MUTTON BIRIYANI   	: " +Biriyani.mbTotal);
			}
			if(Biriyani.cbTotal > 0)
				
			{
			System.out.println("CHICKEN BIRIYANI   	: " +Biriyani.cbTotal);
			}
			if(Biriyani.sbTotal > 0)
				
			{
			System.out.println("SHRIMP BIRIYANI    	: " +Biriyani.sbTotal);
			}
			if(Drinks.sdTotal > 0)
				
			{
			System.out.println("SOFTDRINKS   	: " +Drinks.sdTotal);
			}
			if(Drinks.hdTotal > 0)
				
			{
			System.out.println("HOTDRINKS   	: " +Drinks.hdTotal);
			}
	
				
			System.out.println("Total 		:"+totalBill);
			break;
			
		}
		case 5:
		{
			System.out.println("Thank You!!!!");
			System.exit(0);
			break;
		}

	}

}
}
}