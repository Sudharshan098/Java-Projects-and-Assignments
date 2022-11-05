package com.shan.Q4;

import java.util.Scanner;

public class Main {
	
	
	public static void checkCh(String str,int n) {
	   
		Scanner sc = new Scanner(System.in);
		if(n<=str.length()) {
			char[] ch=str.toCharArray();
			System.out.println("Character at the position "+n+" => " + ch[n]);
		}
		
		
		else if(n>str.length()) {
			System.out.println("Invalid position, Please enter a valid position =>");
			int x=sc.nextInt();
		    checkCh(str,x);
		}
	
		
	}
	
	
	

	public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
			System.out.println("Enter a String =>");
			String str=sc.next();
			
			
			System.out.println("Enter a position =>");
			int n=sc.nextInt();
			
			
			checkCh(str,n);
			
		}

}
