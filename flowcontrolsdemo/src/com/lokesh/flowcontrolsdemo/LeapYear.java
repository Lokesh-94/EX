package com.lokesh.flowcontrolsdemo;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		int year;
		boolean b;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the year");
		year = sc.nextInt();
		if (year % 400 == 0 )
		{
			b=true;
		}
		else if (year % 100 == 0)
		{
			b=false;
		}
		
		else if (year % 4 == 0)
		{
		b=true;	
		}
		else 
		{
			b=false;
		}
		if (b)
		{
			System.out.println("Given Year is a Leap Year");
		}
		else
		{
			System.out.println("Given Year is Not a Leap Year");
		}
	
	}
}
