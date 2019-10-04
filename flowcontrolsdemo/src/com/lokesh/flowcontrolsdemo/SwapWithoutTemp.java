package com.lokesh.flowcontrolsdemo;

import java.util.Scanner;

public class SwapWithoutTemp {
	public static void main(String[] args) {
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		a=sc.nextInt();
		System.out.println("enter Second number");
		b=sc.nextInt();
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("swaped First Number" + a);
		System.out.println("swaped Second Number" + b);
		
		
	}
}
