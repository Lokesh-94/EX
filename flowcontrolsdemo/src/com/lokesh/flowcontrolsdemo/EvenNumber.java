package com.lokesh.flowcontrolsdemo;

import java.util.Scanner;

public class EvenNumber {
	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		a= sc.nextInt();
		
		if (a%2 ==0)
		{
			System.out.println("given Number is Even number");
		}
		else
		{
			System.out.println("Given Number is Odd Number");
		}
	}

}
