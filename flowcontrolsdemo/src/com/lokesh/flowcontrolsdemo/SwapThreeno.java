package com.lokesh.flowcontrolsdemo;

import java.util.Scanner;

public class SwapThreeno {
	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		a=sc.nextInt();
		System.out.println("enter Second number");
		b=sc.nextInt();
		System.out.println("enter Third number");
		c=sc.nextInt();
		temp = a;
		a=c;
		c=b;
		b=temp;
		System.out.println("swaped First Number" + a);
		System.out.println("swaped Second Number" + b);
		System.out.println("swaped Third Number" + c);
		
	}

}
