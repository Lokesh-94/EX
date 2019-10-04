package com.lokesh.flowcontrolsdemo;

import java.util.Scanner;

public class SwapThreeNoTemp {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		a=sc.nextInt();
		System.out.println("enter Second number");
		b=sc.nextInt();
		System.out.println("enter Third number");
		c=sc.nextInt();
		a=a+b+c;

		b=a - (b+c);
		c=a - (b+c);
		a=a - (b+c);
		System.out.println("swaped First Number" + a);
		System.out.println("swaped Second Number" + b);
		System.out.println("swaped Third Number" + c);

	}

}
