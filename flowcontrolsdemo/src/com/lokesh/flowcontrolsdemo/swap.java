package com.lokesh.flowcontrolsdemo;

import java.util.Scanner;

public class swap {

	public static void main(String[] args) {
		int a;
		int b;
		int temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		a=sc.nextInt();
		System.out.println("enter Second number");
		b=sc.nextInt();
		temp = a;
		a=b;
		b=temp;
		System.out.println("swaped First Number" + a);
		System.out.println("swaped Second Number" + b);
		
		

	}

}
