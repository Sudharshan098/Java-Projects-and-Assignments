package com.shan.Q2;

import java.util.Scanner;

public class Char {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the String");
		String str = sc.nextLine();
		System.out.println("Enter the character position you want to access");
		int x=sc.nextInt();
		char ch=str.charAt(x);
		System.out.println("Character at position 2 is : "+ch);
		
		
	}

}
