package com.test;

import java.util.Scanner;

public class AdditionUserInput {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First Value");
		int a=sc.nextInt();
		System.out.print("Enter Second value");
		int b=sc.nextInt();
		System.out.println("The Answer Is:"+(a+b));
		
		
	}

}
